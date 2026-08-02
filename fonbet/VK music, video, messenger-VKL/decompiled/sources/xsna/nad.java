package xsna;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.clips.edit.privacy.PrivacyViewer;
import com.vk.core.ui.CircularProgressView;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.DuetMeta;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.PrivacyRules;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.dw20;
import xsna.k1u0;
import xsna.lgj0;
import xsna.tlo0;
import xsna.tzp0;

/* compiled from: ClipPrivacyEditorBottomSheet.kt */
/* loaded from: classes16.dex */
public final class nad extends dw20.b {
    public static final String u = fpf0.a(nad.class).l();
    public static final tzp0.c.a v = new tzp0.c.a(new a(), false);
    public final l7s e;
    public VideoFile f;
    public WeakReference<dw20> g;
    public View h;
    public VkCell i;
    public VkCell j;
    public VkCell k;
    public CircularProgressView l;
    public final PrivacySetting m;
    public final PrivacySetting n;
    public final boolean o;
    public PrivacySetting p;
    public final boolean q;
    public final boolean r;
    public boolean s;
    public boolean t;

    /* compiled from: ClipPrivacyEditorBottomSheet.kt */
    public static final class a implements m0q0 {
        @Override // xsna.m0q0
        public final void y(UiTrackingScreen uiTrackingScreen) {
            uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_PRIVACY_COMMON_SETTINGS;
        }
    }

    public nad(l7s l7sVar, VideoFile videoFile) {
        super(l7sVar, v);
        DuetMeta duetMeta;
        this.e = l7sVar;
        this.f = videoFile;
        PrivacySetting privacySetting = new PrivacySetting();
        Object obj = ywe.a;
        boolean z = true;
        privacySetting.e = ywe.g(this.f, true);
        this.m = privacySetting;
        PrivacySetting privacySetting2 = new PrivacySetting();
        privacySetting2.e = ywe.g(this.f, false);
        this.n = privacySetting2;
        this.o = this.f.X2();
        VideoFile videoFile2 = this.f;
        boolean f = (videoFile2 == null || !(videoFile2 instanceof ClipVideoFile) || (duetMeta = ((ClipVideoFile) videoFile2).G1) == null) ? false : epx.f(duetMeta.b, Boolean.TRUE);
        this.q = f;
        if (!privacySetting2.e.contains(PrivacyRules.h) && !privacySetting2.e.contains(PrivacyRules.a) && !privacySetting2.e.contains(PrivacyRules.d)) {
            z = false;
        }
        this.r = z;
        this.s = f;
        this.t = z;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void S0(Context context, PrivacySetting privacySetting, List<UserId> list, List<Integer> list2) {
        io.reactivex.rxjava3.core.x<String> b;
        Object obj = ywe.a;
        String d = ywe.d(context, privacySetting, list, list2, PrivacyViewer.SETTING);
        if (d != null) {
            b = io.reactivex.rxjava3.core.x.k(d);
        } else {
            jed0 jed0Var = (jed0) ywe.a.getValue();
            jed0Var.getClass();
            b = jed0Var.b(privacySetting.e);
        }
        io.reactivex.rxjava3.disposables.c subscribe = b.m(asu0.a.d()).subscribe(new um0(new dsc(this, 1), 15), new wf1(new o43(8, this, context), 12));
        View view = this.h;
        if (view == null) {
            view = null;
        }
        hg1.b(view, subscribe);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void T0() {
        l7s l7sVar = this.e;
        Activity h = e3m.h(l7sVar);
        ez20 p = h != null ? rdi.p(h, new q(this, 19)) : null;
        u0(l7sVar.getThemeResId());
        l(e3m.f(R.attr.vk_ui_background_content, l7sVar));
        v0(R.string.accessibility_settings);
        int i = 0;
        View inflate = LayoutInflater.from(l7sVar).inflate(R.layout.clip_view_privacy_editor, (ViewGroup) null, false);
        this.h = inflate;
        VkCell vkCell = (VkCell) inflate.findViewById(R.id.privacy_setting_cell);
        bwt0.p0(vkCell, fkq0.d(this.f.I0()));
        int i2 = 7;
        vkCell.setRight(new VkCell.Right.d((VkCell.Right.a) null, (VkCell.Right.e) null, (VkCell.Right.ExtraAction.a) null, new VkCell.Right.b((izs) null, (tlo0.f) null, (k1u0.a) null, 7), 23));
        this.i = vkCell;
        View view = this.h;
        if (view == null) {
            view = null;
        }
        VkCell vkCell2 = (VkCell) view.findViewById(R.id.duet_setting_switch);
        boolean z = this.o;
        bwt0.p0(vkCell2, !z);
        VkCell.Middle.a aVar = VkCell.Middle.Companion;
        vkCell2.setMiddle(VkCell.Middle.a.a(aVar, new VkCell.Middle.e(tq.h(tlo0.Companion, R.string.clips_publish_allow_duets_title), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), new VkCell.Middle.d((tlo0) new tlo0.f(R.string.clips_publish_allow_duets_subtitle), (gzs) null, 0, (TextUtils.TruncateAt) (0 == true ? 1 : 0), (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62), null, 12));
        VkCell.Right.c cVar = VkCell.Right.Companion;
        int i3 = 4;
        vkCell2.setRight(VkCell.Right.c.a(cVar, new VkCell.Right.a.f(i3, new m4(this, 19), this.q), null, null, null, 30));
        this.j = vkCell2;
        View view2 = this.h;
        if (view2 == null) {
            view2 = null;
        }
        VkCell vkCell3 = (VkCell) view2.findViewById(R.id.comments_setting_switch);
        vkCell3.setMiddle(VkCell.Middle.a.a(aVar, new VkCell.Middle.e(new tlo0.f(R.string.clips_allow_comments), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), new VkCell.Middle.d(z ? new tlo0.f(R.string.live_recording_allow_comments_description_subtitle) : new tlo0.f(R.string.clips_allow_comments_description_subtitle), (gzs) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62), null, 12));
        vkCell3.setRight(VkCell.Right.c.a(cVar, new VkCell.Right.a.f(i3, new pu(this, 24), this.r), null, null, null, 30));
        this.k = vkCell3;
        View view3 = this.h;
        if (view3 == null) {
            view3 = null;
        }
        this.l = (CircularProgressView) view3.findViewById(R.id.video_setting_loading);
        X0();
        U0();
        View view4 = this.h;
        if (view4 == null) {
            view4 = null;
        }
        D0(view4, false);
        t();
        R0(false);
        this.d.q1 = cn70.b(16);
        d0(new zy(p, 23));
        a0(new s(6, p, this));
        View view5 = this.h;
        if (view5 == null) {
            view5 = null;
        }
        c(new jgj(view5, 0, 0, 62));
        c(new cpo(false, 0, 7));
        this.g = new WeakReference<>(I0(u));
        Object obj = ywe.a;
        PrivacySetting privacySetting = this.p;
        if (privacySetting == null) {
            privacySetting = this.m;
        }
        if (ywe.f(privacySetting) == PostingVisibilityMode.UNAVAILABLE_FRIENDS_AND_FRIENDS_LISTS) {
            int i4 = 9;
            io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.observable.c0(rsg0.T(yfb.x(lgj0.a.c(Collections.singletonList(this.f.a1()), null))).U(new n7(new vt1(i4), 10)), new b60(new gr3(this, 13), 11), io.reactivex.rxjava3.internal.functions.a.c).a0(io.reactivex.rxjava3.android.schedulers.a.b()).C(new jad(this, i)).subscribe(new bn3(new r7(this, 25), i4));
            View view6 = this.h;
            if (view6 == null) {
                view6 = null;
            }
            hg1.b(view6, subscribe);
        }
        io.reactivex.rxjava3.disposables.c subscribe2 = wjs0.b.a0(io.reactivex.rxjava3.android.schedulers.a.b()).b0(fyr0.class).subscribe(new ff3(new com.vk.im.ui.fragments.b(this, 26), i2));
        View view7 = this.h;
        hg1.b(view7 != null ? view7 : null, subscribe2);
    }

    public final void U0() {
        Object obj = ywe.a;
        List<PrivacySetting.PrivacyRule> privacy = this.f.getPrivacy();
        if (privacy == null) {
            privacy = EmptyList.b;
        }
        Pair e = ywe.e(privacy);
        kad kadVar = new kad(this, (List) e.d(), (List) e.g(), 0);
        VkCell vkCell = this.i;
        if (vkCell == null) {
            vkCell = null;
        }
        bwt0.i0(vkCell, new fh1(8, this, kadVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void V0(String str) {
        String e = this.o ? y8g0.e(R.string.edit_live_recording_watch_privacy_title) : y8g0.e(R.string.edit_clip_watch_privacy_title);
        VkCell vkCell = this.i;
        if (vkCell == null) {
            vkCell = null;
        }
        vkCell.setMiddle(VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(oq.d(tlo0.Companion, e), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), new VkCell.Middle.d((tlo0) new tlo0.h(str), (gzs) (0 == true ? 1 : 0), 0, (TextUtils.TruncateAt) (0 == true ? 1 : 0), (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62), null, 12));
    }

    public final void W0(PrivacySetting privacySetting, Boolean bool, Boolean bool2) {
        Object obj = ywe.a;
        VideoFile videoFile = this.f;
        if (bool == null) {
            privacySetting = null;
        }
        io.reactivex.rxjava3.disposables.c a2 = ywe.b(videoFile, null, privacySetting, bool2, new dg(this, 20)).a();
        View view = this.h;
        hg1.b(view != null ? view : null, a2);
    }

    public final void X0() {
        if (fkq0.d(this.f.I0())) {
            Object obj = ywe.a;
            List<PrivacySetting.PrivacyRule> privacy = this.f.getPrivacy();
            if (privacy == null) {
                privacy = EmptyList.b;
            }
            Pair e = ywe.e(privacy);
            List<UserId> list = (List) e.d();
            List<Integer> list2 = (List) e.g();
            PrivacySetting privacySetting = this.p;
            if (privacySetting == null) {
                privacySetting = this.m;
            }
            S0(this.e, privacySetting, list, list2);
        }
    }
}
