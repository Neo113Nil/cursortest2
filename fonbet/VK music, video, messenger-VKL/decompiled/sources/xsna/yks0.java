package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.AdminLeaveAction;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.models.comment.ReplyInfo;
import com.vk.log.L;
import com.vk.newsfeed.impl.fragments.BottomSheetCommentsFragment;
import com.vk.newsfeed.impl.fragments.ClipsBottomSheetCommentsFragment;
import com.vk.newsfeed.impl.fragments.VideoBottomSheetCommentsFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;
import xsna.pdv0;
import xsna.v1t0;

/* compiled from: VideoFileController.kt */
/* loaded from: classes17.dex */
public final class yks0 {
    public String a;
    public String b;
    public Boolean c;
    public boolean d;
    public VideoFile e;
    public final Set<a> f = tj0.c();
    public final io.reactivex.rxjava3.disposables.b g;
    public final dck h;
    public static final b i = new b();
    private static final yks0 STUB = new yks0(new VideoFileOld(), null, null);

    /* compiled from: VideoFileController.kt */
    public static final class b {
        public final yks0 getSTUB() {
            return yks0.STUB;
        }
    }

    /* compiled from: VideoFileController.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    public yks0(VideoFile videoFile, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.e = videoFile;
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.g = bVar;
        this.h = new dck(this, 2);
        pro0.f(new pis0(this, 1));
        bVar.b(wjs0.b.a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new eeh0(new yka0(this, 20), 13)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void g(yks0 yks0Var, Context context, gzs gzsVar, int i2) {
        if ((i2 & 2) != 0) {
            gzsVar = null;
        }
        yks0Var.f(context, gzsVar, null);
    }

    public static FragmentImpl h(yks0 yks0Var, Context context, Fragment fragment, ReplyInfo replyInfo, String str, Boolean bool, Boolean bool2, boolean z, int i2) {
        FragmentManager supportFragmentManager;
        Integer num;
        Object obj;
        Parcelable parcelable;
        Class cls;
        List<VideoAttachment> Pb;
        Object parcelable2;
        List<VideoAttachment> Pb2;
        Object parcelable3;
        Integer num2;
        Boolean bool3 = Boolean.TRUE;
        Integer num3 = (i2 & 16) != 0 ? null : 8388693;
        Boolean bool4 = (i2 & 64) != 0 ? null : bool3;
        Boolean bool5 = (i2 & 512) != 0 ? null : bool2;
        Boolean bool6 = (i2 & 1024) != 0 ? null : bool3;
        boolean z2 = (i2 & 4096) == 0;
        boolean z3 = (i2 & 8192) == 0 ? z : true;
        yks0Var.getClass();
        if (p90.e((AppCompatActivity) e3m.h(context))) {
            return null;
        }
        if (fragment == null || (supportFragmentManager = fragment.getFragmentManager()) == null) {
            supportFragmentManager = ((AppCompatActivity) e3m.h(context)).getSupportFragmentManager();
        }
        pdv0.a d = vtk0.c().d(yks0Var.e);
        Bundle bundle = d.j;
        if (replyInfo != null) {
            d.F(replyInfo.b);
        }
        if (replyInfo != null && (num2 = replyInfo.c) != null) {
            bundle.putInt("arg_parent_comment_id", num2.intValue());
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            parcelable3 = bundle.getParcelable("entry", NewsEntry.class);
            Object obj2 = (Parcelable) parcelable3;
            num = num3;
            obj = obj2;
        } else {
            Object parcelable4 = bundle.getParcelable("entry");
            num = num3;
            if (!(parcelable4 instanceof NewsEntry)) {
                parcelable4 = null;
            }
            obj = (NewsEntry) parcelable4;
        }
        Videos videos = obj instanceof Videos ? (Videos) obj : null;
        VideoAttachment videoAttachment = (videos == null || (Pb2 = videos.Pb()) == null) ? null : (VideoAttachment) j5g.a0(Pb2);
        if (videoAttachment == null || videoAttachment.C2()) {
            if (i3 >= 33) {
                parcelable2 = bundle.getParcelable("entry", NewsEntry.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable5 = bundle.getParcelable("entry");
                if (!(parcelable5 instanceof NewsEntry)) {
                    parcelable5 = null;
                }
                parcelable = (NewsEntry) parcelable5;
            }
            Videos videos2 = parcelable instanceof Videos ? (Videos) parcelable : null;
            VideoAttachment videoAttachment2 = (videos2 == null || (Pb = videos2.Pb()) == null) ? null : (VideoAttachment) j5g.a0(Pb);
            cls = (videoAttachment2 == null || !videoAttachment2.C2()) ? BottomSheetCommentsFragment.class : ClipsBottomSheetCommentsFragment.class;
        } else {
            cls = VideoBottomSheetCommentsFragment.class;
        }
        d.g = cls;
        d.B(yks0Var.e.r());
        bundle.putBoolean("BottomSheetCommentsFragment.can_comment", yks0Var.e.c0());
        boolean q = BuildInfo.q();
        if (str != null) {
            bundle.putCharSequence("custom_title", str);
        }
        bundle.putBoolean("show_comments_count", z2);
        if (num != null) {
            bundle.putInt("BottomSheetCommentsFragment.landscape_gravity", num.intValue());
        }
        dhr0.a.getClass();
        bundle.putInt("forced_theme", dhr0.u().c);
        bundle.putBoolean("PostViewFrgament.show_keyboard", false);
        d.J(yks0Var.a);
        d.K(bool3.booleanValue());
        if (bool4 != null) {
            bundle.putBoolean("arg_is_footer_disabled", bool4.booleanValue());
        }
        bundle.putBoolean("arg_is_order_info_disabled", bool.booleanValue());
        if (bool5 != null) {
            bundle.putBoolean("BottomSheetCommentsFragment.is_back_button_enabled", bool5.booleanValue());
        }
        if (!q && bool6 != null) {
            bundle.putBoolean("BottomSheetCommentsFragment.is_without_background", bool6.booleanValue());
        }
        bundle.putBoolean("dismiss_on_opening_video", bool3.booleanValue());
        d.L(z3);
        FragmentImpl f = d.f();
        if (fragment != null) {
            f.setTargetFragment(fragment, 5552);
        }
        f.Td(supportFragmentManager, "BottomSheetCommentsFragment_" + yks0Var.e.r1());
        return f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
    
        if (r2.equals("video_fullscreen_landscape") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007d, code lost:
    
        r3 = "action_menu";
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        if (r2.equals("video_fullscreen_portrait") == false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void k(yks0 yks0Var, Context context, boolean z, String str, String str2, wyg wygVar, UserId userId, String str3, FullSourceJoinApi fullSourceJoinApi, izs izsVar, int i2) {
        String str4;
        io.reactivex.rxjava3.core.q h;
        String str5 = null;
        String str6 = (i2 & 4) != 0 ? null : str;
        String str7 = (i2 & 8) != 0 ? null : str2;
        izs av70Var = (i2 & 16) != 0 ? new av70(11) : wygVar;
        UserId I0 = (i2 & 32) != 0 ? yks0Var.e.I0() : userId;
        String str8 = (i2 & 64) != 0 ? null : str3;
        FullSourceJoinApi fullSourceJoinApi2 = (i2 & 128) != 0 ? null : fullSourceJoinApi;
        UserId B = dz5.B(yks0Var.e, I0);
        if (str7 == null) {
            if (str6 != null) {
                int hashCode = str6.hashCode();
                if (hashCode != -1701312037) {
                    if (hashCode != -902861701) {
                        if (hashCode == 1922070252 && str6.equals("video_discovery")) {
                            str5 = "button";
                        }
                    }
                }
            }
            str4 = str5;
        } else {
            str4 = str7;
        }
        if (fkq0.d(B)) {
            o0r0 e = xwk.e();
            String r = yks0Var.e.r();
            boolean z2 = !epx.f(yks0Var.a, "clips");
            if (str6 == null) {
                str6 = yks0Var.a;
            }
            h = o0r0.i(e, B, false, r, z2, str6, 96);
        } else {
            zvm0 T = xwk.e().T();
            String r2 = yks0Var.e.r();
            if (str6 == null) {
                str6 = yks0Var.a;
            }
            h = zvm0.h(T, B, false, r2, str6, fullSourceJoinApi2, null, str4, str8, 72);
        }
        ((io.reactivex.rxjava3.core.q) av70Var.invoke(h)).U(new fhb0(new qjg0(yks0Var, 12), 13)).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new zks0(context, yks0Var, izsVar, z));
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:
    
        if (r2.equals("video_fullscreen_landscape") == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
    
        r1 = "action_menu";
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006a, code lost:
    
        if (r2.equals("video_fullscreen_portrait") == false) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void l(final yks0 yks0Var, final Context context, String str, String str2, rr3 rr3Var, UserId userId, final gzs gzsVar, int i2) {
        final boolean z = (i2 & 2) != 0;
        String str3 = null;
        final String str4 = (i2 & 4) != 0 ? null : str;
        String str5 = (i2 & 8) != 0 ? null : str2;
        final izs av70Var = (i2 & 16) != 0 ? new av70(11) : rr3Var;
        final UserId B = dz5.B(yks0Var.e, (i2 & 32) != 0 ? yks0Var.e.I0() : userId);
        if (str5 != null) {
            str3 = str5;
        } else if (str4 != null) {
            int hashCode = str4.hashCode();
            if (hashCode != -1701312037) {
                if (hashCode != -902861701) {
                    if (hashCode == 1922070252 && str4.equals("video_discovery")) {
                        str3 = "button";
                    }
                }
            }
        }
        final String str6 = str3;
        e4h.l(xwk.e().h0(), context, B, new izs() { // from class: xsna.xks0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                io.reactivex.rxjava3.core.q l;
                AdminLeaveAction adminLeaveAction = (AdminLeaveAction) obj;
                UserId userId2 = UserId.this;
                boolean d = fkq0.d(userId2);
                String str7 = str4;
                yks0 yks0Var2 = yks0Var;
                if (d) {
                    o0r0 e = xwk.e();
                    if (str7 == null) {
                        str7 = yks0Var2.a;
                    }
                    l = e.k(userId2, adminLeaveAction, yks0Var2.e.r(), str7);
                } else {
                    zvm0 T = xwk.e().T();
                    if (str7 == null) {
                        str7 = yks0Var2.a;
                    }
                    l = T.l(userId2, yks0Var2.e.r(), str7, adminLeaveAction, str6);
                }
                ((io.reactivex.rxjava3.core.q) av70Var.invoke(l)).U(new nlf0(new hfm0(yks0Var2, 15), 12)).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new als0(context, yks0Var2, z, gzsVar));
                return s3q0.a;
            }
        }, null, 24);
    }

    public final void b(a aVar) {
        this.f.add(aVar);
    }

    public final void c() {
        try {
            this.f.clear();
        } catch (Exception unused) {
        }
        this.g.e();
        p870.f().g(this.h);
    }

    public final void d(yg5 yg5Var) {
        int i2 = 0;
        this.g.b(rsg0.w0(new gns0(this.e.I0(), this.e.o0(), this.e.C1())).m(asu0.a.d()).subscribe(new vks0(new whi0(8, this, yg5Var), i2), new wks0(new c(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), i2)));
    }

    public final Pair<VideoFile, VideoFile> e(boolean z) {
        VideoFileOld copy = this.e.copy();
        copy.t0 = z;
        Owner owner = copy.v0;
        if (owner != null) {
            owner.g(4, z);
        }
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        VideoFileOld copy2 = b.C1208b.a().e(this.e, null).A().copy();
        copy2.t0 = z;
        Owner owner2 = copy2.v0;
        if (owner2 != null) {
            owner2.g(4, z);
        }
        return new Pair<>(copy, copy2);
    }

    public final void f(Context context, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2) {
        if (fxc0.B().b0().e(this.e)) {
            cvk.u(R.string.video_deleted_by_owner, false);
            return;
        }
        w1s0.e(context, this.e, this.a, gzsVar, gzsVar2);
        List l = e43.l(new v1t0.e(this.e.l1()), new v1t0.d(this.e.O9()));
        Iterator<T> it = this.f.iterator();
        while (it.hasNext()) {
            ((a) it.next()).He(l, this.e);
        }
    }

    public final void i(boolean z) {
        if (this.d != z) {
            Iterator<T> it = this.f.iterator();
            while (it.hasNext()) {
                ((a) it.next()).uf(z);
            }
        }
        this.d = z;
    }

    public final void j(VideoFile videoFile) {
        if (!epx.f(this.e.r1(), videoFile.r1())) {
            i(false);
        }
        this.e = videoFile;
        if (SystemClock.elapsedRealtime() - videoFile.getTimestamp() >= ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS || this.c != null) {
            return;
        }
        Boolean valueOf = Boolean.valueOf(!videoFile.U());
        if (!epx.f(this.c, valueOf)) {
            Iterator<T> it = this.f.iterator();
            while (it.hasNext()) {
                ((a) it.next()).vk(valueOf.equals(Boolean.TRUE));
            }
        }
        this.c = valueOf;
    }

    /* compiled from: VideoFileController.kt */
    public interface a {
        void He(List list, VideoFile videoFile);

        default void dismiss() {
        }

        default void uf(boolean z) {
        }

        default void vk(boolean z) {
        }

        default void L9(VideoFile videoFile, boolean z) {
        }
    }
}
