package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.preference.Preference;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.debug.ui.dev.DebugFileManagerFragment;
import com.vk.debug.ui.user.DebugUserSettingsFragment;
import com.vk.documents.ui.fragments.DocumentsViewFragment;
import com.vk.dto.music.Playlist;
import com.vk.im.ui.fragments.ImCreateChatFragment;
import com.vk.lists.AbstractPaginatedView;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;
import java.util.List;
import kotlin.Result;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.webrtc.NativeDoubleArrayConsumer;
import ru.ok.android.webrtc.animoji.AnimojiCore;
import xsna.c2n;
import xsna.dgh;
import xsna.hlw;
import xsna.m2n;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class bk1 implements AbstractPaginatedView.g, NativeDoubleArrayConsumer.Consumer, io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.core.s, io.reactivex.rxjava3.functions.m, Preference.c, Preference.b, c2n.a, Toolbar.h, h9l, hlw.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bk1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        Preference preference2 = (Preference) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        preference2.F(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 2:
                return (s3q0) ((vs) this.c).invoke(obj);
            case 3:
            case 5:
            case 10:
            case 11:
            case 12:
            case 14:
            case 16:
            case 19:
            case 20:
            default:
                return (io.reactivex.rxjava3.core.e) ((com.vk.movika.sdk.base.ui.s0) this.c).invoke(obj);
            case 4:
                return (Result) ((wg1) this.c).invoke(obj);
            case 6:
                return (io.reactivex.rxjava3.core.b0) ((kp5) this.c).invoke(obj);
            case 7:
                return (ncq0) ((nk) this.c).invoke(obj);
            case 8:
                return (c6h) ((nk) this.c).invoke(obj);
            case 9:
                return ((dgh.e) this.c).invoke(obj);
            case 13:
                return (w960) ((nk) this.c).invoke(obj);
            case 15:
                return (b0l0) ((nk) this.c).invoke(obj);
            case 17:
                return (io.reactivex.rxjava3.core.t) ((v74) this.c).invoke(obj);
            case 18:
                return (g16) ((nk) this.c).invoke(obj);
            case 21:
                return (yax) ((ebx) this.c).invoke(obj);
            case 22:
                return (List) ((nk) this.c).invoke(obj);
            case 23:
                return (io.reactivex.rxjava3.core.b0) ((g720) this.c).invoke(obj);
            case 24:
                return (Playlist) ((ebx) this.c).c;
            case 25:
                return (List) ((g720) this.c).invoke(obj);
            case 26:
                return (List) ((qw30) this.c).invoke(obj);
            case 27:
                return (io.reactivex.rxjava3.core.b0) ((wg1) this.c).invoke(obj);
        }
    }

    @Override // xsna.c2n.a
    public void b(c2n.b bVar) {
        DiscoverMediaTabFragment2 discoverMediaTabFragment2 = (DiscoverMediaTabFragment2) this.c;
        qcy<Object>[] qcyVarArr = DiscoverMediaTabFragment2.C0;
        if (bVar.a) {
            return;
        }
        discoverMediaTabFragment2.ho().b(new m2n.e.a(true));
    }

    @Override // com.vk.lists.AbstractPaginatedView.g
    public int c(int i) {
        dk1 dk1Var = (dk1) this.c;
        int i2 = i > iah0.a((float) 600) ? 3 : 2;
        dk1Var.h = i2;
        return i2;
    }

    @Override // org.webrtc.NativeDoubleArrayConsumer.Consumer
    public void consume(Double[] dArr) {
        AnimojiCore.a((AnimojiCore) this.c, dArr);
    }

    @Override // xsna.hlw.a
    public void d(hlw hlwVar) {
        ihd0 ihd0Var = (ihd0) this.c;
        synchronized (ihd0Var.h) {
            ihd0Var.f(hlwVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putBoolean;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 10:
                DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) obj;
                String[] strArr = DebugDevSettingsFragment.t0;
                debugDevSettingsFragment.getClass();
                new DebugFileManagerFragment.a(DebugFileManagerFragment.class, null, null).k(debugDevSettingsFragment.mo2getContext());
                break;
            default:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj;
                int i2 = DebugUserSettingsFragment.l0;
                L.a.getClass();
                v7r v7rVar = L.h;
                (v7rVar != null ? v7rVar : null).c();
                Preference preference2 = (Preference) ref$ObjectRef.element;
                if (preference2 != null) {
                    preference2.F(false);
                }
                LoggerOutputTarget.Companion.getClass();
                L.y(e43.a(LoggerOutputTarget.LOGCAT, LoggerOutputTarget.RING_FILE, LoggerOutputTarget.EXTERNAL));
                preference.F(false);
                preference.I("Уже включено");
                SharedPreferences l = preference.l();
                if (l != null && (edit = l.edit()) != null && (putBoolean = edit.putBoolean("__dbg_log_to_file", true)) != null) {
                    putBoolean.apply();
                    break;
                }
                break;
        }
        return true;
    }

    @Override // androidx.appcompat.widget.Toolbar.h
    public boolean onMenuItemClick(MenuItem menuItem) {
        ImCreateChatFragment imCreateChatFragment = (ImCreateChatFragment) this.c;
        int i = ImCreateChatFragment.d0;
        return imCreateChatFragment.onOptionsItemSelected(menuItem);
    }

    @Override // xsna.h9l
    public g9l provide() {
        return new k5r((NewsfeedRouter) this.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // io.reactivex.rxjava3.core.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void subscribe(io.reactivex.rxjava3.core.r rVar) {
        int i;
        com.vk.clips.design.view.timeline.a aVar = (com.vk.clips.design.view.timeline.a) this.c;
        int i2 = com.vk.clips.design.view.timeline.a.P;
        if (rVar != null && rVar.h()) {
            rVar.onComplete();
            return;
        }
        int measuredWidth = ((aVar.getMeasuredWidth() - iah0.a(16)) - aVar.getPaddingEnd()) - aVar.getPaddingStart();
        if (aVar.E) {
            aVar.h = (int) (aVar.i * 0.5625f);
            i = measuredWidth / aVar.h;
        } else {
            int i3 = measuredWidth / aVar.i;
            aVar.h = (int) Math.ceil(measuredWidth / i3);
            i = i3;
        }
        long j = i;
        aVar.y = j != 0 ? aVar.K / j : 0L;
        MediaMetadataRetriever mediaMetadataRetriever = null;
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
        try {
            try {
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        if (aVar.J == null) {
            throw new NullPointerException();
        }
        Uri parse = Uri.parse(aVar.J);
        MediaMetadataRetriever mediaMetadataRetriever3 = new MediaMetadataRetriever();
        try {
            if (epx.f(parse.getScheme(), "CONTENT")) {
                Context context = e43.a;
                mediaMetadataRetriever3.setDataSource(context != null ? context : null, parse);
            } else {
                mediaMetadataRetriever3.setDataSource(aVar.J);
            }
            for (int i4 = 0; i4 < i; i4++) {
                if (rVar != null) {
                    if (rVar.h()) {
                        break;
                    }
                }
                Bitmap b = aVar.b(i4, mediaMetadataRetriever3);
                if (b != null && rVar != null) {
                    rVar.onNext(b);
                }
            }
            mediaMetadataRetriever3.release();
        } catch (Exception e2) {
            e = e2;
            mediaMetadataRetriever = mediaMetadataRetriever3;
            L.j(new Exception(e.getMessage() + ", path: " + aVar.J, e), "baseTimeline");
            if (mediaMetadataRetriever != null) {
                mediaMetadataRetriever.release();
            }
            if (rVar == null) {
            }
        } catch (Throwable th2) {
            th = th2;
            mediaMetadataRetriever2 = mediaMetadataRetriever3;
            if (mediaMetadataRetriever2 != null) {
                mediaMetadataRetriever2.release();
            }
            throw th;
        }
        if (rVar == null) {
            rVar.onComplete();
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 5:
                return ((Boolean) ((nk) obj2).invoke(obj)).booleanValue();
            default:
                int i2 = DocumentsViewFragment.x0;
                ((DocumentsViewFragment) obj2).getClass();
                return (obj instanceof h7o0) || (obj instanceof pun);
        }
    }
}
