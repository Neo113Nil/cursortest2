package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.mvp.holder.video.assistant.a;
import com.vk.core.view.components.cell.VkCellSkeleton;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.skeleton.VkSkeleton;
import com.vk.core.view.fresco.VKEnhancedImageView;
import com.vk.dto.attaches.AttachGift;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.popup.PopupStickerAnimation;
import com.vk.dto.user.RequestUserProfile;
import com.vk.geo.impl.model.BoundingBox;
import com.vk.im.engine.models.upload.ResumableAttachUploadInfo;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.log.L;
import com.vk.newsfeed.common.recycler.holders.donut.DonutPostClickSource;
import com.vk.photo.editor.PhotoEditorView;
import com.vk.qrcode.QRStatsTracker;
import com.vkontakte.android.R;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.dz40;
import xsna.egm;
import xsna.fss;
import xsna.hjl0;
import xsna.ig3;
import xsna.kbl0;
import xsna.lzk;
import xsna.mms;
import xsna.oi3;
import xsna.rfb;
import xsna.spb;
import xsna.sx40;
import xsna.uns;
import xsna.xx30;
import xsna.yt;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class dy0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dy0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v1, types: [T, xsna.hyb0] */
    /* JADX WARN: Type inference failed for: r4v28, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        io.reactivex.rxjava3.core.x e0Var;
        int i = 3;
        int i2 = 10;
        int i3 = 0;
        int i4 = 1;
        switch (this.b) {
            case 0:
                com.vk.clips.sdk.shared.item.ads.c cVar = (com.vk.clips.sdk.shared.item.ads.c) this.c;
                ?? r10 = this.d;
                ux0 ux0Var = cVar.B;
                cjh0 o = cVar.g.o();
                yux yuxVar = cVar.l;
                boolean z = cVar.p;
                bb bbVar = new bb(cVar, 2);
                return new zy0(ux0Var, r10, o, yuxVar, z, new qw0(new cb(cVar, i), bbVar, bbVar, new ey0(cVar, i3), new eb(cVar, i4)), cVar.q);
            case 1:
                izs izsVar = (izs) this.c;
                rg50 rg50Var = (rg50) this.d;
                izsVar.invoke(new a.f());
                rg50Var.C(rg50Var.getIntValue() + 1);
                return s3q0.a;
            case 2:
                ((nj3) this.c).d.invoke(new ig3.e.d((oi3.a) this.d));
                return s3q0.a;
            case 3:
                qr6 qr6Var = (qr6) this.c;
                String str = (String) this.d;
                StringBuilder sb = new StringBuilder("UPLOAD_TRACE doUpload: URL changed from ");
                ResumableAttachUploadInfo resumableAttachUploadInfo = qr6Var.p;
                sb.append((resumableAttachUploadInfo != null ? resumableAttachUploadInfo : null).n());
                sb.append(" to ");
                sb.append(str);
                sb.append(", resetting progress");
                return sb.toString();
            case 4:
                wgb wgbVar = (wgb) this.c;
                return wgbVar.s + ": updateExpiredHistory: fetch from network, args=" + ((rfb.a.b) this.d);
            case 5:
                ((ypb) this.c).m.invoke((spb.b) this.d);
                return s3q0.a;
            case 6:
                PopupStickerAnimation popupStickerAnimation = (PopupStickerAnimation) this.c;
                ChatFragment chatFragment = (ChatFragment) this.d;
                ChatFragment.d dVar = ChatFragment.w1;
                if (popupStickerAnimation.b) {
                    final myb0 I0 = chatFragment.B0.I0();
                    final long j = ChatFragment.y1;
                    I0.getClass();
                    HashMap<UserId, kbl0> hashMap = kbl0.b;
                    if (kbl0.a.b().c().zb()) {
                        Ref$IntRef ref$IntRef = new Ref$IntRef();
                        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                        ref$ObjectRef.element = new hyb0(j, 6);
                        e0Var = new io.reactivex.rxjava3.internal.operators.single.e0(new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.v(new Callable(I0, j) { // from class: xsna.jyb0
                            public final /* synthetic */ long c;

                            {
                                this.c = j;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r0v2, types: [T, xsna.hyb0] */
                            /* JADX WARN: Type inference failed for: r0v7 */
                            /* JADX WARN: Type inference failed for: r0v8 */
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                hyb0 b = myb0.d().b(this.c);
                                Ref$ObjectRef ref$ObjectRef2 = Ref$ObjectRef.this;
                                ?? r0 = b;
                                if (b == null) {
                                    r0 = (hyb0) ref$ObjectRef2.element;
                                }
                                ref$ObjectRef2.element = r0;
                                return Integer.valueOf(r0.c);
                            }
                        }).q(asu0.a.c()), new s41(new kyb0(ref$IntRef, j), 28)).l(new vx6(new lyb0(I0, ref$ObjectRef, ref$IntRef), 29)), new mh40(new bp7(I0, ref$ObjectRef, ref$IntRef), 8));
                    } else {
                        e0Var = io.reactivex.rxjava3.core.x.k(Boolean.FALSE);
                    }
                    chatFragment.D0.b(e0Var.m(asu0.a.d()).subscribe(new eu0(new com.vk.im.ui.components.viewcontrollers.dialog_header.info.a(chatFragment, 20), i2), new wf1(new vw4(L.a, 1), i2)));
                }
                return s3q0.a;
            case 7:
                myc0.h((yvj) this.c, null, null, new lzk.b((xvy) this.d, null), 3);
                return s3q0.a;
            case 8:
                c5m c5mVar = (c5m) this.c;
                Context context = (Context) this.d;
                j4m j4mVar = c5mVar.e;
                (j4mVar != null ? j4mVar : null).j0(context);
                dw20 dw20Var = c5mVar.f;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 9:
                hgm hgmVar = (hgm) this.c;
                ViewGroup viewGroup = (ViewGroup) this.d;
                VkImageSimple vkImageSimple = new VkImageSimple(hgmVar.d, null, 6, 0);
                vkImageSimple.setId(R.id.dialog_item_read_out_icon);
                Pair pair = new Pair(Integer.valueOf(R.drawable.vk_icon_check_double_outline_16), Integer.valueOf(R.attr.vk_ui_icon_accent_themed));
                omw.d(vkImageSimple, ((Number) pair.d()).intValue(), ((Number) pair.g()).intValue());
                vkImageSimple.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                vkImageSimple.setContentDescription(null);
                egm.b bVar = hgmVar.m;
                vkImageSimple.setLayoutParams(egm.W(hgmVar, (bVar != null ? bVar : null).g, (bVar != null ? bVar : null).g, (bVar != null ? bVar : null).h, 0, 0, 0, 56));
                viewGroup.addView(vkImageSimple);
                return vkImageSimple;
            case 10:
                return new SimpleDateFormat(((Context) this.c).getString(R.string.vkim_dialogs_list_time_today), ((vlm) this.d).f);
            case 11:
                n1o n1oVar = (n1o) this.c;
                j1o.a(n1oVar, n1oVar.itemView.getContext(), ((zzn) this.d).l, (p4r) n1oVar.G.getValue(), DonutPostClickSource.Button);
                return s3q0.a;
            case 12:
                ((izs) this.c).invoke(((vqe) this.d).h());
                return s3q0.a;
            case 13:
                ((nis) this.c).c.a(new fss.a((RequestUserProfile) this.d));
                return s3q0.a;
            case 14:
                ((tms) this.c).a.a(new mms.d(((uns.a.d) this.d).a, false));
                return s3q0.a;
            case 15:
                return Float.valueOf(((Number) ((rqt) this.c).d.invoke((BoundingBox) this.d)).floatValue());
            case 16:
                pr20 pr20Var = (pr20) this.c;
                RecyclerView.e0 e0Var2 = (RecyclerView.e0) this.d;
                kr20 kr20Var = pr20Var.o;
                (kr20Var != null ? kr20Var : null).x0(e0Var2 != null ? e0Var2.getAbsoluteAdapterPosition() : -1);
                return s3q0.a;
            case 17:
                tho0 tho0Var = (tho0) this.c;
                wh50 wh50Var = (wh50) this.d;
                if (!qko0.b(tho0Var.b, ((tho0) wh50Var.getValue()).b) || !epx.f(tho0Var.c, ((tho0) wh50Var.getValue()).c)) {
                    wh50Var.setValue(tho0Var);
                }
                return s3q0.a;
            case 18:
                wq30 wq30Var = (wq30) this.c;
                AttachGift attachGift = (AttachGift) this.d;
                VKEnhancedImageView vKEnhancedImageView = wq30Var.f;
                f4m.j(vKEnhancedImageView != null ? vKEnhancedImageView : null);
                wq30Var.x(attachGift);
                return s3q0.a;
            case 19:
                a1w a1wVar = (a1w) this.c;
                sw30 sw30Var = (sw30) this.d;
                return new my8(a1wVar, new vw30(1, sw30Var, xx30.a.class, "isDialogAllowed", "isDialogAllowed(Lcom/vk/im/engine/models/dialogs/Dialog;)Z", 0), new ww30(1, sw30Var, xx30.a.class, "isDialogActive", "isDialogActive(Lcom/vk/im/engine/models/dialogs/Dialog;)Z", 0));
            case 20:
                lv40 lv40Var = (lv40) this.c;
                izs izsVar2 = (izs) this.d;
                if (((Boolean) ((zak0) lv40Var.b).getValue()).booleanValue()) {
                    izsVar2.invoke(sx40.p0.b);
                } else {
                    izsVar2.invoke(new sx40.l(((dz40.o.b) ((zak0) lv40Var.a).getValue()).a));
                }
                return s3q0.a;
            case 21:
                gzs gzsVar = (gzs) this.c;
                kd80 kd80Var = (kd80) this.d;
                gzsVar.invoke();
                kd80Var.h.b(null);
                return s3q0.a;
            case 22:
                return PhotoEditorView.e((PhotoEditorView) this.c, (d5p) this.d);
            case 23:
                return Float.valueOf(((Number) ((wh50) this.c).getValue()).intValue() == 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : ((Number) ((wh50) this.d).getValue()).intValue() / ((Number) r1.getValue()).intValue());
            case 24:
                Context context2 = (Context) this.c;
                azl azlVar = (azl) this.d;
                wz4 wz4Var = new wz4(context2);
                wz4Var.b.setColor(-1);
                wz4Var.l.set(new Rect(0, azlVar.r0(1), azlVar.r0(10), azlVar.r0(11)));
                wz4Var.setState(new int[]{android.R.attr.state_selected});
                wz4Var.j = false;
                return wz4Var;
            case 25:
                jme0 jme0Var = (jme0) this.c;
                cme0 cme0Var = (cme0) this.d;
                jme0Var.a();
                com.vk.qrcode.d dVar2 = com.vk.qrcode.d.b;
                com.vk.qrcode.d.a(cme0Var);
                QRStatsTracker qRStatsTracker = QRStatsTracker.a;
                QRStatsTracker.a(QRStatsTracker.Action.COPY_TEXT);
                return s3q0.a;
            case 26:
                ofl0 ofl0Var = (ofl0) this.c;
                String str2 = (String) this.d;
                StringBuilder b = ho8.b(epx.f(ofl0Var.h(), sfl0.b) ? "reset" : "set", " colors for left ");
                b.append(ofl0Var.i(str2));
                b.append(" (url=");
                b.append(str2);
                b.append(')');
                return b.toString();
            case 27:
                wh50 wh50Var2 = (wh50) this.c;
                izs izsVar3 = (izs) this.d;
                wh50Var2.setValue(Boolean.FALSE);
                izsVar3.invoke(hjl0.a.h.b);
                return s3q0.a;
            case 28:
                k2u0 k2u0Var = (k2u0) this.c;
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) this.d;
                k2u0Var.b.invoke(yt.a.a);
                ikv0 ikv0Var = (ikv0) ref$ObjectRef2.element;
                if (ikv0Var != null) {
                    ikv0Var.a();
                }
                return s3q0.a;
            default:
                Context context3 = (Context) this.c;
                VkCellSkeleton vkCellSkeleton = (VkCellSkeleton) this.d;
                int i5 = VkCellSkeleton.n;
                VkSkeleton vkSkeleton = new VkSkeleton(context3, null, 0, 14, 0);
                vkSkeleton.setId(R.id.ds_internal_cell_skeleton_left_main);
                vkSkeleton.setArea(vkCellSkeleton.getArea());
                vkSkeleton.setShimmer(vkCellSkeleton.b);
                vkSkeleton.setShimmerManagedExternally(true);
                return vkSkeleton;
        }
    }
}
