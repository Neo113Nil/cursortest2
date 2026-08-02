package xsna;

import android.text.TextUtils;
import com.vk.content.privacy.di.ContentPrivacyComponent;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import kotlin.Lazy;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.tlo0;

/* compiled from: BaseLivesCameraSettingsController.kt */
/* loaded from: classes16.dex */
public abstract class ig6 extends ql9 {
    public final bpn0 d;
    public final bpn0 e;
    public gzs<s3q0> f;
    public gzs<s3q0> g;
    public izs<? super rfd0, s3q0> h;
    public UserId i;

    public ig6(Lazy<? extends ContentPrivacyComponent> lazy) {
        this.d = new bpn0(new ry0(lazy, 7));
        this.e = new bpn0(new ji0(lazy, 7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(VkCell vkCell) {
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.element = fxc0.B().T().t();
        VkCell.Right.c cVar = VkCell.Right.Companion;
        boolean z = ref$BooleanRef.element;
        VkCell.Right.a.f fVar = new VkCell.Right.a.f(4, new z4(ref$BooleanRef, 10), z);
        vkCell.setRight(VkCell.Right.c.a(cVar, fVar, null, null, null, 30));
        VkCell.Middle.a aVar = VkCell.Middle.Companion;
        tlo0.f h = tq.h(tlo0.Companion, R.string.stories_settings_publish_story_title);
        int i = 0;
        Object[] objArr = 0 == true ? 1 : 0;
        vkCell.setMiddle(VkCell.Middle.a.a(aVar, new VkCell.Middle.e(h, i, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), new VkCell.Middle.d((tlo0) new tlo0.f(R.string.stories_settings_publish_story_text), (gzs) null, 0, (TextUtils.TruncateAt) objArr, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62), null, 12));
    }

    public final ufd0 b() {
        return (ufd0) this.e.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void c(VkCell vkCell) {
        if (!o25.a().i().k) {
            f4m.j(vkCell);
            return;
        }
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.element = fxc0.B().T().y();
        VkCell.Right.c cVar = VkCell.Right.Companion;
        boolean z = ref$BooleanRef.element;
        VkCell.Right.a.f fVar = new VkCell.Right.a.f(4, new in0(ref$BooleanRef, 8), z);
        vkCell.setRight(VkCell.Right.c.a(cVar, fVar, null, null, null, 30));
        VkCell.Middle.a aVar = VkCell.Middle.Companion;
        tlo0.f h = tq.h(tlo0.Companion, R.string.stories_settings_publish_wall_title);
        int i = 0;
        Object[] objArr = 0 == true ? 1 : 0;
        vkCell.setMiddle(VkCell.Middle.a.a(aVar, new VkCell.Middle.e(h, i, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), new VkCell.Middle.d((tlo0) new tlo0.f(R.string.stories_settings_publish_wall_text), (gzs) null, 0, (TextUtils.TruncateAt) objArr, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62), null, 12));
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.LIVES_PRIVACY_COMMON_SETTINGS;
    }
}
