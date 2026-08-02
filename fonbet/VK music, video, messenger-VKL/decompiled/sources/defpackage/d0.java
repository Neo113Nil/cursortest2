package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import androidx.compose.ui.platform.ComposeView;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.ui.mvp.holder.video.showcase.VideoFlatActionViewHolder;
import com.vk.clips.design.view.camera.controls.ClipsControlsView;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.log.L;
import com.vk.sharing.api.dto.Target;
import com.vk.sharing.core.cancellation.TargetSharingTask;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeMessagingSyncContactsClickItem;
import com.vk.superapp.bridges.dto.VkAlertData;
import com.vkontakte.android.R;
import defpackage.l0;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.a0a;
import xsna.bjc;
import xsna.cu60;
import xsna.dw20;
import xsna.e3m;
import xsna.fpf0;
import xsna.gzs;
import xsna.i0q0;
import xsna.icj0;
import xsna.lmv;
import xsna.m7m;
import xsna.nda;
import xsna.nhi0;
import xsna.o9;
import xsna.oyk0;
import xsna.pq9;
import xsna.s200;
import xsna.s3q0;
import xsna.t9j;
import xsna.un9;
import xsna.vs60;
import xsna.ww50;
import xsna.xh60;
import xsna.z9j;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class d0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d0(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        ww50 v;
        switch (this.b) {
            case 0:
                ((l0) this.c).g.a((VkAlertData.c) this.d, (l0.a) this.e);
                return s3q0.a;
            case 1:
                CameraUIView cameraUIView = (CameraUIView) this.c;
                String str = (String) this.d;
                RectF rectF = (RectF) this.e;
                float f = CameraUIView.w1;
                un9 un9Var = new un9(cameraUIView, str, rectF, r1);
                if (cameraUIView.B.b.L) {
                    ClipsControlsView clipsControls = cameraUIView.getClipsControls();
                    if (clipsControls != null) {
                        lmv.J2(clipsControls, new o9(6, cameraUIView, un9Var), 3);
                    }
                } else {
                    un9Var.invoke();
                }
                return s3q0.a;
            case 2:
                final pq9 pq9Var = (pq9) this.c;
                final Target target = (Target) this.d;
                final Integer num = (Integer) this.e;
                if (pq9Var.d(target)) {
                    return s3q0.a;
                }
                final nhi0 b = pq9Var.b();
                String commentText = pq9Var.a.getCommentText();
                pq9Var.b().a.y2(target, num != null ? num.intValue() : 0, commentText);
                TargetSharingTask targetSharingTask = new TargetSharingTask(System.currentTimeMillis(), target, commentText, num, new Runnable() { // from class: xsna.oq9
                    @Override // java.lang.Runnable
                    public final void run() {
                        pq9.this.c(target, b, num);
                    }
                });
                HashMap hashMap = pq9Var.c;
                Target target2 = targetSharingTask.c;
                hashMap.put(new icj0(target2.k, target2.c, target2.l), targetSharingTask);
                i0q0.d(targetSharingTask.f, targetSharingTask);
                return s3q0.a;
            case 3:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
                Activity activity = (Activity) this.d;
                z9j z9jVar = (z9j) this.e;
                UiTracker uiTracker = UiTracker.a;
                new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new SchemeStat$TypeMessagingSyncContactsClickItem(SchemeStat$TypeMessagingSyncContactsClickItem.EventType.MODAL_SYNC_CONTACTS_SHARE_CHAT_LINK_CLICK), 2)).q();
                dw20 dw20Var = (dw20) ref$ObjectRef.element;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                try {
                    String format = String.format("https://%s/im?sel=%s", Arrays.copyOf(new Object[]{a0a.d, Long.valueOf(((BridgeComponent) m7m.e().a(fpf0.a(BridgeComponent.class))).s().o().a.b)}, 2));
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", format);
                    intent.addFlags(268435456);
                    Intent createChooser = Intent.createChooser(intent, activity.getString(R.string.sync_contacts_bottom_sheet_share_chooser_title));
                    createChooser.addFlags(268435456);
                    activity.startActivity(createChooser);
                } catch (Exception e) {
                    L.j(e, "Failed to share chat link");
                }
                z9jVar.invoke();
                return s3q0.a;
            case 4:
                cu60 cu60Var = (cu60) this.c;
                Context context = (Context) this.d;
                xh60.f fVar = (xh60.f) this.e;
                if (!(fVar instanceof xh60.f.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                xh60.f.a aVar = (xh60.f.a) fVar;
                Activity h = e3m.h(context);
                if (h != null && (v = s200.v(h)) != null && v.m(aVar.a)) {
                    cu60Var.a.a(vs60.d.a.b);
                }
                return s3q0.a;
            case 5:
                String str2 = (String) this.c;
                Object obj = this.d;
                oyk0 oyk0Var = (oyk0) this.e;
                return "addCustomParam() - key= " + str2 + " value= " + obj + " " + oyk0Var.d() + " statInfo= " + oyk0Var.i + " nextStatInfo= " + oyk0Var.j;
            default:
                VideoFlatActionViewHolder videoFlatActionViewHolder = (VideoFlatActionViewHolder) this.c;
                ComposeView composeView = (ComposeView) this.d;
                UIBlockActionOpenSection uIBlockActionOpenSection = (UIBlockActionOpenSection) this.e;
                nda.e(videoFlatActionViewHolder.c.b.b, composeView.getContext(), videoFlatActionViewHolder.b, uIBlockActionOpenSection.B, uIBlockActionOpenSection.z, null, null, videoFlatActionViewHolder.d, 112);
                return s3q0.a;
        }
    }

    public /* synthetic */ d0(t9j t9jVar, Ref$ObjectRef ref$ObjectRef, Activity activity, z9j z9jVar) {
        this.b = 3;
        this.c = ref$ObjectRef;
        this.d = activity;
        this.e = z9jVar;
    }
}
