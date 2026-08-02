package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import com.vk.core.files.ExternalDirType;
import com.vk.core.files.a;
import com.vk.log.L;
import com.vk.toggle.b;
import com.vk.toggle.features.VoipFeatures;
import com.vk.voip.OKVoipEngine;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.jsonwebtoken.JwtParser;
import java.io.File;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;
import kotlin.text.Regex;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.dev.DebugManager;
import ru.ok.android.externcalls.sdk.dev.MediaDumpManager;

/* compiled from: VoipViewModelAudioDumpDelegate.kt */
/* loaded from: classes11.dex */
public final class p4x0 implements MediaDumpManager.LocalAudioDumpRecordListener {
    public static final b c = new b("", "", false, null);
    public String a;
    public final io.reactivex.rxjava3.subjects.d<b> b = io.reactivex.rxjava3.subjects.d.O0(c);

    /* compiled from: VoipViewModelAudioDumpDelegate.kt */
    /* loaded from: classes7.dex */
    public static final class a {
        public final boolean a;
        public final int b;
        public final MediaDumpManager.Source c;

        public a() {
            this(0, 7);
        }

        public final int a() {
            return this.b;
        }

        public final MediaDumpManager.Source b() {
            return this.c;
        }

        public final boolean c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            int a = shy.a(this.b, Boolean.hashCode(this.a) * 31, 31);
            MediaDumpManager.Source source = this.c;
            return a + (source == null ? 0 : source.hashCode());
        }

        public final String toString() {
            return "Config(isForced=" + this.a + ", durationSec=" + this.b + ", source=" + this.c + ')';
        }

        public a(boolean z, int i, MediaDumpManager.Source source) {
            this.a = z;
            this.b = i;
            this.c = source;
        }

        public /* synthetic */ a(int i, int i2) {
            this(false, (i2 & 2) != 0 ? 900 : i, (i2 & 4) != 0 ? MediaDumpManager.Source.IN_ENTER_PROCESSING : null);
        }
    }

    /* compiled from: VoipViewModelAudioDumpDelegate.kt */
    public static final class b {
        public final String a;
        public final String b;
        public final boolean c;
        public final MediaDumpManager.Source d;

        public b(String str, String str2, boolean z, MediaDumpManager.Source source) {
            this.a = str;
            this.b = str2;
            this.c = z;
            this.d = source;
        }

        public static b a(b bVar, String str, boolean z, MediaDumpManager.Source source, int i) {
            String str2 = bVar.a;
            if ((i & 2) != 0) {
                str = bVar.b;
            }
            if ((i & 8) != 0) {
                source = bVar.d;
            }
            return new b(str2, str, z, source);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d;
        }

        public final int hashCode() {
            int b = qoy.b(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            MediaDumpManager.Source source = this.d;
            return b + (source == null ? 0 : source.hashCode());
        }

        public final String toString() {
            return "RecordInfo(opponentName=" + this.a + ", recordStartTime=" + this.b + ", inProgress=" + this.c + ", source=" + this.d + ')';
        }
    }

    /* compiled from: VoipViewModelAudioDumpDelegate.kt */
    /* loaded from: classes7.dex */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaDumpManager.Source.values().length];
            try {
                iArr[MediaDumpManager.Source.IN_ENTER_PROCESSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaDumpManager.Source.OUT_ENTER_PROCESSING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public p4x0(com.vk.voip.ui.c cVar) {
    }

    public static void a(File file, b bVar, MediaDumpManager.Source source) {
        StringBuilder sb;
        try {
            StringBuilder sb2 = new StringBuilder();
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            int i = c.$EnumSwitchMapping$0[source.ordinal()];
            sb2.append(context.getString(i != 1 ? i != 2 ? R.string.voip_local_dump_file_name : R.string.voip_local_dump_file_name_out : R.string.voip_local_dump_file_name_in, bVar.a, bVar.b));
            sb2.append(".wav");
            String sb3 = sb2.toString();
            seq seqVar = com.vk.core.files.a.b;
            Context context2 = e43.a;
            ExternalDirType externalDirType = ExternalDirType.DOWNLOADS;
            seqVar.getClass();
            Uri c2 = seq.c(context2, sb3, externalDirType);
            L.e("VoipViewModelAudioDumpDelegate", "extracting data to " + c2);
            Context context3 = e43.a;
            OutputStream c3 = a.c.c(context3 != null ? context3 : null, c2);
            if (c3 == null) {
                try {
                    vhk0.d(file);
                    return;
                } catch (Throwable th) {
                    L.f("VoipViewModelAudioDumpDelegate", "Dump directory " + file + " was not removed", th);
                    return;
                }
            }
            try {
                File file2 = new File(file, source.getFileName() + ".pcm");
                StringBuilder sb4 = new StringBuilder("extracting data from ");
                sb4.append(file2.getAbsolutePath());
                L.e("VoipViewModelAudioDumpDelegate", sb4.toString());
                if (!file2.isFile()) {
                    L.e("VoipViewModelAudioDumpDelegate", "source file not found " + file2.getAbsolutePath());
                    c3.close();
                    vhk0.d(file);
                    return;
                }
                blk.K(file2, c3);
                s3q0 s3q0Var = s3q0.a;
                c3.close();
                L.e("VoipViewModelAudioDumpDelegate", "data extraction completed");
                e(R.string.voip_local_dump_saved, c(sb3));
                try {
                    vhk0.d(file);
                } catch (Throwable th2) {
                    th = th2;
                    sb = new StringBuilder("Dump directory ");
                    sb.append(file);
                    sb.append(" was not removed");
                    L.f("VoipViewModelAudioDumpDelegate", sb.toString(), th);
                }
            } finally {
            }
        } catch (Throwable th3) {
            try {
                L.f("VoipViewModelAudioDumpDelegate", "data extraction failed", th3);
                e(R.string.voip_local_dump_failed, new Object[0]);
                try {
                    Regex regex = com.vk.core.files.a.a;
                    vhk0.d(file);
                } catch (Throwable th4) {
                    th = th4;
                    sb = new StringBuilder("Dump directory ");
                    sb.append(file);
                    sb.append(" was not removed");
                    L.f("VoipViewModelAudioDumpDelegate", sb.toString(), th);
                }
            } catch (Throwable th5) {
                try {
                    Regex regex2 = com.vk.core.files.a.a;
                    vhk0.d(file);
                } catch (Throwable th6) {
                    L.f("VoipViewModelAudioDumpDelegate", "Dump directory " + file + " was not removed", th6);
                }
                throw th5;
            }
        }
    }

    public static a b(MediaDumpManager.Source source) {
        a aVar;
        b.d i = com.vk.toggle.b.A.i(VoipFeatures.ENABLE_FULL_AUDIO_DUMP_RECORD);
        int i2 = 7;
        int i3 = 0;
        if (i != null) {
            a aVar2 = null;
            Object obj = null;
            if (i.a) {
                JSONObject g = i.g();
                if (g == null) {
                    aVar = new a(i3, i2);
                } else {
                    try {
                        boolean f = epx.f(f370.q(g, "force"), Boolean.TRUE);
                        Integer x = f370.x(g, "duration_sec");
                        int g2 = swe0.g(x != null ? x.intValue() : 900, 3, 3600);
                        String D = f370.D(g, "source");
                        if (D != null) {
                            Iterator<E> it = MediaDumpManager.Source.getEntries().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                Object next = it.next();
                                if (epx.f(((MediaDumpManager.Source) next).getFileName(), D)) {
                                    obj = next;
                                    break;
                                }
                            }
                            MediaDumpManager.Source source2 = (MediaDumpManager.Source) obj;
                            if (source2 != null) {
                                source = source2;
                                aVar2 = new a(f, g2, source);
                            }
                        }
                        if (source == null) {
                            source = MediaDumpManager.Source.IN_ENTER_PROCESSING;
                        }
                        aVar2 = new a(f, g2, source);
                    } catch (Throwable unused) {
                        aVar = new a(i3, i2);
                    }
                }
                aVar2 = aVar;
            }
            if (aVar2 != null) {
                return aVar2;
            }
        }
        return new a(i3, i2);
    }

    public static String c(String str) {
        ExternalDirType externalDirType = ExternalDirType.DOWNLOADS;
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(externalDirType.h());
        File file = new File(new File(externalStoragePublicDirectory, externalDirType.i()), str);
        File parentFile = externalStoragePublicDirectory.getParentFile();
        if (parentFile == null) {
            parentFile = file;
        }
        q9r o = nbr.o(obr.i(file));
        q9r o2 = nbr.o(obr.i(parentFile));
        String str2 = null;
        if (epx.f(o.a(), o2.a())) {
            int c2 = o2.c();
            int c3 = o.c();
            int min = Math.min(c3, c2);
            int i = 0;
            while (i < min && epx.f(o.b().get(i), o2.b().get(i))) {
                i++;
            }
            StringBuilder sb = new StringBuilder();
            int i2 = c2 - 1;
            if (i <= i2) {
                while (!epx.f(o2.b().get(i2).getName(), "..")) {
                    sb.append("..");
                    if (i2 != i) {
                        sb.append(File.separatorChar);
                    }
                    if (i2 != i) {
                        i2--;
                    }
                }
            }
            if (i < c3) {
                if (i < c2) {
                    sb.append(File.separatorChar);
                }
                j5g.f0(j5g.S(o.b(), i), sb, File.separator, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            }
            str2 = sb.toString();
        }
        if (str2 != null) {
            return new File(str2).getPath();
        }
        throw new IllegalArgumentException("this and base files have different roots: " + file + " and " + parentFile + JwtParser.SEPARATOR_CHAR);
    }

    public static void e(int i, Object... objArr) {
        i0q0.i(0L, new sn9(i, objArr));
    }

    public final void d() {
        io.reactivex.rxjava3.subjects.d<b> dVar = this.b;
        b P0 = dVar.P0();
        if (P0 == null) {
            return;
        }
        MediaDumpManager.Source source = P0.d;
        L.e("VoipViewModelAudioDumpDelegate", "Starting call audio dump post-processing");
        dVar.onNext(b.a(P0, null, false, null, 11));
        if (P0.c) {
            String str = this.a;
            if (str != null) {
                if (source == null) {
                    L.e("VoipViewModelAudioDumpDelegate", "Data extraction was not requested for call dump. Keep it as it is");
                } else {
                    L.e("VoipViewModelAudioDumpDelegate", "Recorded data will be extracted as from " + source + ' ');
                }
                asu0.a.c().c(new ugr(this, str, P0));
            } else {
                L.e("VoipViewModelAudioDumpDelegate", "audio dump record not found");
            }
            this.a = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(a aVar) {
        DebugManager debugManager;
        MediaDumpManager mediaDumpManager;
        OKVoipEngine oKVoipEngine = com.vk.voip.ui.c.r;
        String str = null;
        if (oKVoipEngine == null) {
            oKVoipEngine = null;
        }
        if (oKVoipEngine == null) {
            return;
        }
        io.reactivex.rxjava3.subjects.d<b> dVar = this.b;
        b P0 = dVar.P0();
        if (P0 != null) {
            if (P0.c) {
                e(R.string.voip_local_dump_already_in_progress, new Object[0]);
            }
            if (P0 != null) {
                return;
            }
            cnw0 cnw0Var = OKVoipEngine.v;
            if (cnw0Var == null) {
                cnw0Var = null;
            }
            if (((kqw0) cnw0Var.g()).b() == null) {
                L.l("VoipViewModelAudioDumpDelegate", "Audio dump location isn't set. Ignore start record request");
                return;
            }
            dVar.onNext(b.a(P0, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(Calendar.getInstance().getTime()), true, aVar.b(), 1));
            int a2 = aVar.a();
            MediaDumpManager.Source b2 = aVar.b();
            EnumSet of = b2 != null ? EnumSet.of(b2) : null;
            Conversation conversation = OKVoipEngine.E.getConversation();
            if (conversation != null && (debugManager = conversation.getDebugManager()) != null && (mediaDumpManager = debugManager.getMediaDumpManager()) != null) {
                str = mediaDumpManager.recordAudioDump(a2, of, this);
            }
            this.a = str;
            return;
        }
        P0 = null;
        if (P0 != null) {
        }
    }

    @Override // ru.ok.android.externcalls.sdk.dev.MediaDumpManager.LocalAudioDumpRecordListener
    public final void onRecordCompleted(String str) {
        i0q0.f(new wfu0(this, 5));
    }

    @Override // ru.ok.android.externcalls.sdk.dev.MediaDumpManager.LocalAudioDumpRecordListener
    public final void onRecordStarted(String str) {
        i0q0.f(new nyk0(this));
    }
}
