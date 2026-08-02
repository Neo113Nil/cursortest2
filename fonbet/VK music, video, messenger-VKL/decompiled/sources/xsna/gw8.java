package xsna;

import android.content.Context;
import android.net.Uri;
import android.webkit.CookieManager;
import androidx.fragment.app.FragmentActivity;
import com.vk.cachecontrol.api.CacheTarget;
import com.vk.core.apps.BuildInfo;
import com.vk.core.files.ExternalDirType;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.log.L;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.webrtc.Privacy;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.gx8;

/* compiled from: CacheDisposerImpl.kt */
/* loaded from: classes15.dex */
public final class gw8 implements fw8 {
    public final Context a;
    public final gx8 b;
    public final vhc c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CacheDisposerImpl.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a AUDIO;
        public static final a CHATS;
        public static final a DIALOGS;
        public static final a EVENTS;
        public static final a FRIENDS;
        public static final a GROUPS;
        public static final a ML;
        public static final a POSTS;
        private final boolean accountDependent;
        private final String filename;

        static {
            a aVar = new a("ML", 0, "ml.db", true);
            ML = aVar;
            a aVar2 = new a("POSTS", 1, "posts.db", true);
            POSTS = aVar2;
            a aVar3 = new a(Privacy.FRIENDS, 2, "friends.db", true);
            FRIENDS = aVar3;
            a aVar4 = new a("DIALOGS", 3, "dialogs.db", true);
            DIALOGS = aVar4;
            a aVar5 = new a("CHATS", 4, "chats.db", true);
            CHATS = aVar5;
            a aVar6 = new a("GROUPS", 5, "groups.db", true);
            GROUPS = aVar6;
            a aVar7 = new a(SignalingProtocol.MEDIA_OPTION_AUDIO, 6, "audio.db", true);
            AUDIO = aVar7;
            a aVar8 = new a("EVENTS", 7, "events.db", false);
            EVENTS = aVar8;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a(String str, int i, String str2, boolean z) {
            this.filename = str2;
            this.accountDependent = z;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final boolean h() {
            return this.accountDependent;
        }

        public final String i() {
            return this.filename;
        }
    }

    /* compiled from: CacheDisposerImpl.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CacheTarget.values().length];
            try {
                iArr[CacheTarget.PHOTOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CacheTarget.VIDEOS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CacheTarget.DOWNLOADS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CacheTarget.DOWNLOADED_VIDEOS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CacheTarget.OTHER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CacheTarget.SYSTEM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: CacheDisposerImpl.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<List<? extends CacheTarget>, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(List<? extends CacheTarget> list) {
            gw8 gw8Var = (gw8) this.receiver;
            gw8Var.getClass();
            pro0.b();
            for (CacheTarget cacheTarget : list) {
                switch (b.$EnumSwitchMapping$0[cacheTarget.ordinal()]) {
                    case 1:
                        ExternalDirType externalDirType = ExternalDirType.IMAGES;
                        com.vk.core.files.a.b.getClass();
                        vhk0.b(seq.b(externalDirType));
                        break;
                    case 2:
                        ExternalDirType externalDirType2 = ExternalDirType.VIDEO;
                        com.vk.core.files.a.b.getClass();
                        vhk0.b(seq.b(externalDirType2));
                        break;
                    case 3:
                        ExternalDirType externalDirType3 = ExternalDirType.DOWNLOADS;
                        com.vk.core.files.a.b.getClass();
                        vhk0.b(seq.b(externalDirType3));
                        break;
                    case 4:
                        fxc0.B().s().a();
                        fxc0.B().s().e();
                        break;
                    case 5:
                        gw8Var.e();
                        break;
                    case 6:
                        if (BuildInfo.h()) {
                            throw new IllegalStateException(cacheTarget + " shouldn't be available to user choice!");
                        }
                        L.G(cacheTarget + " shouldn't be available to user choice!");
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            return s3q0.a;
        }
    }

    public gw8(Context context, gx8 gx8Var) {
        this.a = context;
        this.b = gx8Var;
        this.c = new vhc(a(), new c(1, this, gw8.class, "clearByUser", "clearByUser(Ljava/util/List;)V", 0), gx8Var);
    }

    public static void f(Context context, boolean z) {
        a[] values = a.values();
        ArrayList arrayList = new ArrayList();
        for (a aVar : values) {
            if (aVar.h() || !z) {
                arrayList.add(aVar);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar2 = (a) it.next();
            if (!context.deleteDatabase(aVar2.i())) {
                L.G("can't delete db " + aVar2);
            }
        }
    }

    public static void g(gx8.a aVar) {
        try {
            aVar.dispose();
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Failed to dispose cache described with '");
            String description = aVar.getDescription();
            L.E(th, "CacheDisposerImpl", ho8.a(sb, description != null ? erm0.D0(100, description) : null, '\''));
        }
    }

    @Override // xsna.fw8
    public final ListBuilder a() {
        ListBuilder e = e43.e();
        e.add(CacheTarget.DOWNLOADED_VIDEOS);
        e.add(CacheTarget.OTHER);
        return e.g();
    }

    @Override // xsna.fw8
    public final void b() {
        Iterator<T> it = this.b.b(CacheTarget.SYSTEM).iterator();
        while (it.hasNext()) {
            g((gx8.a) it.next());
        }
        Context context = this.a;
        f(context, false);
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.removeAllCookies(null);
        cookieManager.flush();
        e();
        nbr.l(context.getCacheDir());
    }

    @Override // xsna.fw8
    public final io.reactivex.rxjava3.core.x c(FragmentActivity fragmentActivity) {
        vhc vhcVar = this.c;
        vhcVar.getClass();
        if (fragmentActivity == null) {
            return io.reactivex.rxjava3.internal.operators.single.a0.b;
        }
        io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new thc(0, vhcVar, fragmentActivity));
        asu0 asu0Var = asu0.a;
        return new io.reactivex.rxjava3.internal.operators.single.n(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.r(vVar.q(asu0Var.c()).m(asu0Var.d()), new nu0(new go1(fragmentActivity, 19), 8)).m(asu0Var.c()), new h8(new com.vk.libvideo.design.view.video.a(7, fragmentActivity, vhcVar), 8)), new gn0(new i8(13), 11)).l(new l8(new lb(vhcVar, 21), 14)), new pv2(new zt4(fragmentActivity, 13), 10));
    }

    @Override // xsna.fw8
    @ozl
    public final void d() {
        PrivateFiles.a b2;
        CacheTarget cacheTarget = CacheTarget.SYSTEM;
        gx8 gx8Var = this.b;
        Iterator it = j5g.u0(gx8Var.b(CacheTarget.OTHER), gx8Var.b(cacheTarget)).iterator();
        while (it.hasNext()) {
            gx8.a aVar = (gx8.a) it.next();
            if (aVar instanceof tv8) {
                tv8 tv8Var = (tv8) aVar;
                try {
                    tv8Var.b.b(true);
                } catch (Throwable th) {
                    StringBuilder sb = new StringBuilder("Failed to multiaccount dispose cache described with '");
                    String description = tv8Var.b.getDescription();
                    L.E(th, "CacheDisposerImpl", ho8.a(sb, description != null ? erm0.D0(100, description) : null, '\''));
                }
            } else {
                g(aVar);
            }
        }
        Context context = this.a;
        f(context, true);
        List l = e43.l(PrivateSubdir.TEMP_UPLOADS, PrivateSubdir.STORIES, PrivateSubdir.STORIES_TEMP, PrivateSubdir.ML_MODELS, PrivateSubdir.VMOJI, PrivateSubdir.STORIES_VIEWER_VIDEO);
        ArrayList arrayList = new ArrayList(c5g.u(l, 10));
        Iterator it2 = l.iterator();
        while (it2.hasNext()) {
            b2 = e8r.a.b(r4, ((PrivateSubdir) it2.next()).h(), true);
            arrayList.add(Uri.fromFile(b2.a).getLastPathSegment());
        }
        File[] listFiles = context.getCacheDir().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!arrayList.contains(Uri.fromFile(file).getLastPathSegment())) {
                    nbr.l(file);
                }
            }
        }
    }

    public final void e() {
        Iterator<T> it = this.b.b(CacheTarget.OTHER).iterator();
        while (it.hasNext()) {
            g((gx8.a) it.next());
        }
        e8r.b.a(true);
    }
}
