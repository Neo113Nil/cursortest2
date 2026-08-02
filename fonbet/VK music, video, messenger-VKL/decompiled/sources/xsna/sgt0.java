package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vk.common.view.BottomSheetWebView;
import com.vk.core.view.components.formitem.VkFormField;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.libvideo.design.view.toolbar.VideoToolbarView;
import com.vk.newsfeed.common.presentation.model.items.attachments.video.VideoSimpleHolderUiDto;
import com.vk.permission.PermissionHelper;
import com.vk.superapp.base.js.bridge.data.VKWebAppPermission;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.ui.c;
import com.vk.voip.ui.media_request.VoipEnableOwnMicAndVideoRequestedDialog;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import xsna.b78;
import xsna.j9d0;
import xsna.sx40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class sgt0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sgt0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        gvw0 gvw0Var;
        boolean t;
        int i = this.b;
        boolean z = false;
        z = false;
        int i2 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                return Boolean.valueOf(((VideoSimpleHolderUiDto) obj).r);
            case 1:
                return VideoToolbarView.a((VideoToolbarView) obj);
            case 2:
                ((b78.g) obj).a().invoke(sx40.c.b);
                return s3q0.a;
            case 3:
                ggu0 ggu0Var = (ggu0) obj;
                return new ubr0(ggu0Var.e, ggu0Var, ggu0Var.d, new tfu0(ggu0Var, i2), ggu0Var.m(), new hbj0(ggu0Var, 28), new egu0(ggu0Var, z ? 1 : 0), ggu0Var.g.a);
            case 4:
                List<Class<? extends View>> list = VkFormField.C;
                return (FrameLayout) ((VkFormField) obj).findViewById(R.id.vk_form_item_layout_container);
            case 5:
                ImageView imageView = new ImageView(((VkGroupHeader.b) obj).b);
                int a = e3m.a(R.dimen.vk_ui_button_medium_height, imageView.getContext());
                imageView.setLayoutParams(new ViewGroup.LayoutParams(a, a));
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                return imageView;
            case 6:
                ((io.reactivex.rxjava3.disposables.c) obj).dispose();
                return s3q0.a;
            case 7:
                fxv0.a.a(new swv0(((qwv0) obj).f, Collections.singletonList(VKWebAppPermission.CAMERA)));
                SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                (superappUiRouterBridge != null ? superappUiRouterBridge : null).N(1000);
                return s3q0.a;
            case 8:
                jkw0 jkw0Var = (jkw0) obj;
                com.vk.voip.ui.c.b.getClass();
                rah0 rah0Var = com.vk.voip.ui.c.g;
                if (rah0Var == null) {
                    rah0Var = null;
                }
                l7s l7sVar = jkw0Var.a;
                Activity h = e3m.h(l7sVar);
                evw0 evw0Var = h instanceof evw0 ? (evw0) h : null;
                if (evw0Var == null || (gvw0Var = evw0Var.getPermissions()) == null) {
                    gvw0Var = new gvw0(l7sVar, new ivw0());
                }
                rah0Var.getClass();
                qah0 qah0Var = new qah0(rah0Var, z ? 1 : 0);
                qbc0 qbc0Var = new qbc0(rah0Var, 7);
                gvw0.a(gvw0Var.a);
                gvw0Var.h = true;
                PermissionHelper permissionHelper = PermissionHelper.a;
                Context context = gvw0Var.a;
                permissionHelper.getClass();
                PermissionHelper.f(permissionHelper, context, PermissionHelper.m, R.string.voip_permissions_audio_share, 0, new dvk0(4, gvw0Var, qah0Var), new ymx0(gvw0Var, qbc0Var, i2), 8);
                return s3q0.a;
            case 9:
                VoipEnableOwnMicAndVideoRequestedDialog voipEnableOwnMicAndVideoRequestedDialog = (VoipEnableOwnMicAndVideoRequestedDialog) obj;
                voipEnableOwnMicAndVideoRequestedDialog.b.invoke(VoipEnableOwnMicAndVideoRequestedDialog.RequestMedia.CAMERA_MICROPHONE);
                dw20 dw20Var = voipEnableOwnMicAndVideoRequestedDialog.c;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                return s3q0.a;
            case 10:
                zqk0 zqk0Var = (zqk0) obj;
                com.vk.voip.ui.c.b.getClass();
                v2x0 v2x0Var = com.vk.voip.ui.c.r0;
                if (v2x0Var == null) {
                    v2x0Var = null;
                }
                v2x0Var.getClass();
                com.vk.voip.ui.c.b.getClass();
                long j = com.vk.voip.ui.c.J().f().b;
                zqk0Var.getClass();
                OKVoipEngine oKVoipEngine = OKVoipEngine.b;
                v2x0 v2x0Var2 = com.vk.voip.ui.c.r0;
                if (v2x0Var2 == null) {
                    v2x0Var2 = null;
                }
                d1w0 d1w0Var = v2x0Var2.c;
                long j2 = zqk0Var.b;
                if (!zqk0Var.i && !com.vk.dto.common.b.a(j2)) {
                    if (com.vk.dto.common.b.d(j2)) {
                        try {
                            z = d1w0Var.a(j2);
                        } finally {
                            if (t) {
                            }
                        }
                    }
                    z = true;
                }
                v2x0 v2x0Var3 = com.vk.voip.ui.c.r0;
                lmc lmcVar = (v2x0Var3 != null ? v2x0Var3 : null).d;
                com.vk.voip.ui.c.b.getClass();
                long j3 = com.vk.voip.ui.c.J().f().b;
                return new c.a(oKVoipEngine, z, true);
            case 11:
                BottomSheetWebView bottomSheetWebView = ((hix0) obj).g1;
                if (bottomSheetWebView != null) {
                    bottomSheetWebView.reload();
                }
                return s3q0.a;
            default:
                ((glx0) obj).e(j9d0.f.a);
                return s3q0.a;
        }
    }
}
