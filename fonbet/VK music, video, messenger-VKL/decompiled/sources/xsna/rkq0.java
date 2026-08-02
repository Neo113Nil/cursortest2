package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.clips.design.view.camera.settings.ModalSettingsRowView;
import com.vk.content.privacy.di.ContentPrivacyComponent;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.data.PrivacySetting;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;

/* compiled from: UserLivesCameraSettingsController.kt */
/* loaded from: classes16.dex */
public final class rkq0 extends ig6 {
    public final Object j;
    public WeakReference<View> k;

    public rkq0(Lazy<? extends ContentPrivacyComponent> lazy) {
        super(lazy);
        this.j = msy.a(LazyThreadSafetyMode.NONE, new qkd0(this, 16));
    }

    public final View e(Context context) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.lives_camera_settings, (ViewGroup) null, false);
        c((VkCell) viewGroup.findViewById(R.id.post_lives_on_wall_container));
        ig6.d((VkCell) viewGroup.findViewById(R.id.save_lives_in_stories_container));
        View findViewById = viewGroup.findViewById(R.id.who_can_see_lives_container);
        int i = 2;
        findViewById.setOnClickListener(new vc4(i, findViewById, this));
        View findViewById2 = viewGroup.findViewById(R.id.who_can_comment_lives_container);
        findViewById2.setOnClickListener(new vc4(i, findViewById2, this));
        qxm0.r(viewGroup);
        return viewGroup;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void g() {
        gzs<s3q0> gzsVar = this.f;
        if (gzsVar != null) {
            gzsVar.invoke();
            this.f = null;
        } else {
            gzs<s3q0> gzsVar2 = this.g;
            if (gzsVar2 != null) {
                gzsVar2.invoke();
            }
            this.h = null;
        }
        if (this.h == null) {
            ((foz) this.j.getValue()).b(null);
            WeakReference<View> weakReference = this.k;
            if (weakReference != null) {
                weakReference.clear();
            }
        }
    }

    public final void h(dw20 dw20Var, List<? extends PrivacySetting> list) {
        ViewGroup Ln = dw20Var.Ln();
        if (Ln == null) {
            return;
        }
        f4m.j(Ln.findViewById(R.id.lives_settings_loader));
        VkCell vkCell = (VkCell) Ln.findViewById(R.id.post_lives_on_wall_container);
        if (!f4m.f(vkCell)) {
            vkCell.setVisibility(0);
        }
        ((VkCell) Ln.findViewById(R.id.save_lives_in_stories_container)).setVisibility(0);
        if (list != null) {
            for (PrivacySetting privacySetting : list) {
                String str = privacySetting.b;
                if (epx.f(str, "lives")) {
                    privacySetting.e = zed0.a(privacySetting.e);
                    ModalSettingsRowView modalSettingsRowView = (ModalSettingsRowView) Ln.findViewById(R.id.who_can_see_lives_container);
                    modalSettingsRowView.setTitle(privacySetting.c);
                    hg1.a(j(modalSettingsRowView, privacySetting), dw20Var);
                    modalSettingsRowView.setTag(privacySetting);
                    modalSettingsRowView.setVisibility(0);
                } else if (epx.f(str, "lives_replies")) {
                    privacySetting.e = zed0.a(privacySetting.e);
                    ModalSettingsRowView modalSettingsRowView2 = (ModalSettingsRowView) Ln.findViewById(R.id.who_can_comment_lives_container);
                    modalSettingsRowView2.setTitle(privacySetting.c);
                    hg1.a(j(modalSettingsRowView2, privacySetting), dw20Var);
                    modalSettingsRowView2.setTag(privacySetting);
                    modalSettingsRowView2.setVisibility(0);
                }
            }
        }
    }

    public final io.reactivex.rxjava3.disposables.c j(ModalSettingsRowView modalSettingsRowView, PrivacySetting privacySetting) {
        return b().g(modalSettingsRowView.getContext(), privacySetting).m(asu0.a.d()).subscribe(new cc20(new or50(modalSettingsRowView, 29), 28), new tk40(new gib0(modalSettingsRowView, 17), 21));
    }
}
