package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.clips.design.view.camera.settings.ModalSettingsRowView;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.live.api.broadcast_settings.models.BroadcastAuthor;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.tlo0;

/* compiled from: GroupLivesCameraSettingsController.kt */
/* loaded from: classes16.dex */
public final class llu extends ig6 {
    public BroadcastAuthor.Group j;

    /* compiled from: GroupLivesCameraSettingsController.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            llu lluVar = (llu) this.receiver;
            gzs<s3q0> gzsVar = lluVar.f;
            if (gzsVar != null) {
                gzsVar.invoke();
                lluVar.f = null;
            } else {
                gzs<s3q0> gzsVar2 = lluVar.g;
                if (gzsVar2 != null) {
                    gzsVar2.invoke();
                }
                lluVar.h = null;
            }
            if (lluVar.h == null) {
                lluVar.j = null;
            }
            return s3q0.a;
        }
    }

    public llu() {
        throw null;
    }

    @Override // xsna.ig6
    public final void c(VkCell vkCell) {
        super.c(vkCell);
        VkCell.Middle.a aVar = VkCell.Middle.Companion;
        VkCell.Middle.b middle = vkCell.getMiddle();
        VkCell.Middle.e eVar = middle != null ? middle.a : null;
        tlo0.a aVar2 = tlo0.Companion;
        String i = b().i(vkCell.getContext());
        aVar2.getClass();
        vkCell.setMiddle(VkCell.Middle.a.a(aVar, eVar, new VkCell.Middle.d(new tlo0.h(i), (gzs) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62), null, 12));
    }

    public final void e(Context context, UserId userId, BroadcastAuthor.Group group, gzs<s3q0> gzsVar, izs<? super rfd0, s3q0> izsVar) {
        this.j = group;
        this.i = userId;
        this.g = gzsVar;
        this.h = izsVar;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.lives_camera_settings, (ViewGroup) null, false);
        c((VkCell) viewGroup.findViewById(R.id.post_lives_on_wall_container));
        ig6.d((VkCell) viewGroup.findViewById(R.id.save_lives_in_stories_container));
        View findViewById = viewGroup.findViewById(R.id.who_can_see_lives_container);
        findViewById.setOnClickListener(new akc(1, this, findViewById));
        View findViewById2 = viewGroup.findViewById(R.id.who_can_comment_lives_container);
        if (findViewById2 != null) {
            f4m.j(findViewById2);
        }
        qxm0.r(viewGroup);
        ModalSettingsRowView modalSettingsRowView = (ModalSettingsRowView) viewGroup.findViewById(R.id.who_can_see_lives_container);
        modalSettingsRowView.setTitle(b().c(viewGroup.getContext()));
        modalSettingsRowView.setHint(b().f(viewGroup.getContext(), b().j().b));
        f4m.j(viewGroup.findViewById(R.id.lives_settings_loader));
        VkCell vkCell = (VkCell) viewGroup.findViewById(R.id.post_lives_on_wall_container);
        if (!f4m.f(vkCell)) {
            vkCell.setVisibility(0);
        }
        viewGroup.findViewById(R.id.who_can_see_lives_container).setVisibility(0);
        ((VkCell) viewGroup.findViewById(R.id.save_lives_in_stories_container)).setVisibility(0);
        a(viewGroup, new a(0, this, llu.class, "handleBottomSheetClosed", "handleBottomSheetClosed()V", 0), null);
    }
}
