package xsna;

import android.content.Context;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetResponseDto;
import com.vk.bridges.ImageViewer;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.ui.mvp.holder.community.CommunityVkTabVh;
import com.vk.clips.uploader.impl.model.ClipUploadJobInternal;
import com.vk.core.serialize.Serializer;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.dto.common.Peer;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.im.engine.models.im_item.ImItemType;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.components.common.LinkAction;
import com.vk.newsfeed.api.posting.community.PostingCountersModel;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.awn0;
import xsna.ded;
import xsna.m680;
import xsna.m8v0;
import xsna.n1j;
import xsna.nzb;
import xsna.oap;
import xsna.spt;
import xsna.t0j0;
import xsna.uxv;
import xsna.xrh;
import xsna.y2j0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class vh9 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vh9(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [T, android.view.MotionEvent] */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, java.lang.String] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = 0;
        boolean z = true;
        char c = 1;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ?? r1 = ((spt.a) obj).a;
                ((Ref$ObjectRef) obj4).element = r1;
                return ((bi9) obj3).b((MusicTrack) obj2, r1);
            case 1:
                v3b v3bVar = (v3b) obj4;
                w2w w2wVar = (w2w) obj3;
                xgl0 xgl0Var = (xgl0) obj2;
                xgl0 xgl0Var2 = (xgl0) obj;
                long j = v3bVar.c;
                xgl0 I0 = w2wVar.I0();
                int r = ad0.B(I0.a().B(j)) ? I0.system().r(j) : I0.system().j();
                r3b e = v3bVar.d ? xgl0Var2.e() : xgl0Var2.y();
                dxf dxfVar = new dxf(e, new exf(xgl0Var, e, new vhb(j, w2wVar.I0())), new eyf(), w2wVar);
                Serializer.c<Peer> cVar = Peer.CREATOR;
                ArrayList a = dxfVar.a(Peer.a.b(j), v3bVar.e, r, true);
                ArrayList arrayList = new ArrayList(c5g.u(a, 10));
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((Msg) it.next()).b));
                }
                SparseArray<Msg> T = e.T(arrayList);
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = a.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (T.indexOfKey(((Msg) next).b) >= 0) {
                        arrayList2.add(next);
                    }
                }
                e.a(arrayList2);
                return a;
            case 2:
                irb irbVar = (irb) obj3;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj4;
                oub oubVar = (oub) obj2;
                ?? r12 = (MotionEvent) obj;
                irbVar.c(r12);
                T t = ref$ObjectRef.element;
                if (t != 0) {
                    float rawY = ((MotionEvent) t).getRawY() - r12.getRawY();
                    if (rawY > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        oubVar.getClass();
                        if (rawY < irbVar.f) {
                            irbVar.b(rawY);
                        } else {
                            irbVar.d();
                        }
                    }
                } else {
                    ref$ObjectRef.element = r12;
                }
                return s3q0.a;
            case 3:
                fef fefVar = (fef) obj3;
                ClipUploadJobInternal clipUploadJobInternal = (ClipUploadJobInternal) obj2;
                ShortVideoGetResponseDto shortVideoGetResponseDto = (ShortVideoGetResponseDto) obj;
                if (!((AtomicBoolean) obj4).getAndSet(true)) {
                    fefVar.l(new Pair<>(clipUploadJobInternal, new ded.a(shortVideoGetResponseDto)));
                    fefVar.a.getLogger().d("ClipsUploadControllerImpl", "await server processing for " + clipUploadJobInternal.b.b);
                }
                return s3q0.a;
            case 4:
                ((imb) obj4).P4(new pmb((ActionLink) obj3, ((Integer) obj).intValue()), new m3g((nzb.d) obj2, c == true ? 1 : 0));
                return s3q0.a;
            case 5:
                jpg jpgVar = (jpg) obj4;
                ViewGroup viewGroup = (ViewGroup) obj3;
                xrh.d.a aVar = (xrh.d.a) obj2;
                View view = (View) obj;
                h7v h7vVar = jpgVar.a;
                if (h7vVar.n()) {
                    return s3q0.a;
                }
                h7vVar.k(viewGroup);
                int i3 = m8v0.M;
                m8v0.a.a(view, aVar.c, null, aVar.f, aVar.e, null, VkTooltip$BalloonPosition.BottomRight, VkTooltip$BalloonTilt.Left, new ipg(view, i2), new rf(23), null, null, new mp3(6, jpgVar, aVar), new ay0(jpgVar, 27), null, 0, true, null, null, false, null, dhr0.C().b, 7785508);
                return s3q0.a;
            case 6:
                CatalogFilterData catalogFilterData = (CatalogFilterData) obj4;
                CommunityVkTabVh communityVkTabVh = (CommunityVkTabVh) obj3;
                nxv0 nxv0Var = (nxv0) obj2;
                if (!catalogFilterData.e) {
                    hg1.b(nxv0Var, eda.c(communityVkTabVh.b, catalogFilterData.b, new oap.a(nxv0Var.getContext()), null, 12));
                }
                return s3q0.a;
            case 7:
                int i4 = n1j.k1;
                ((n1j) obj4).bo((o1j) obj3, n1j.a.HIDE_CLOSE_DIALOG);
                androidx.appcompat.app.d dVar = ((u1j) obj2).C;
                if (dVar != null) {
                    dVar.dismiss();
                }
                return s3q0.a;
            case 8:
                xxt xxtVar = (xxt) obj4;
                Context context = (Context) obj3;
                String str = (String) obj2;
                Throwable th = (Throwable) obj;
                FragmentActivity fragmentActivity = (FragmentActivity) xxtVar.c.invoke();
                if (fragmentActivity != null) {
                    m4s.y(fragmentActivity, new sxt(xxtVar, str, th, context, null));
                    s3q0 s3q0Var = s3q0.a;
                }
                return s3q0.a;
            case 9:
                uxv uxvVar = (uxv) obj4;
                Context context2 = (Context) obj3;
                String str2 = (String) obj2;
                int i5 = uxv.a.$EnumSwitchMapping$0[((LinkAction) obj).ordinal()];
                if (i5 == 2) {
                    uxv.a(context2, str2);
                } else if (i5 == 3) {
                    uxvVar.c.k().a(context2, str2);
                }
                return s3q0.a;
            case 10:
                Map map = (Map) obj2;
                t7w j2 = ((xgl0) obj4).j();
                Collection<com.vk.im.engine.models.dialogs.b> values = ((Map) obj3).values();
                ArrayList arrayList3 = new ArrayList(c5g.u(values, 10));
                for (com.vk.im.engine.models.dialogs.b bVar : values) {
                    long j3 = bVar.b;
                    ImItemType imItemType = ImItemType.DIALOG;
                    b5w b5wVar = new b5w(j3, imItemType);
                    lj30 lj30Var = (lj30) map.get(Long.valueOf(j3));
                    vjm vjmVar = bVar.d;
                    int i6 = (vjmVar.b == 0 && vjmVar.c == 0) ? 0 : bVar.b0;
                    boolean z2 = bVar.S && bVar.c();
                    arrayList3.add(new Pair(b5wVar, com.vk.im.engine.models.im_item.b.e(vjmVar.c(z2).b(bVar.v.d()).b, lj30Var != null && lj30Var.c(), i6, imItemType, vjmVar.c, (lj30Var == null || lj30Var.j || !lj30Var.m) ? 0 : lj30Var.c, 0L)));
                }
                j2.i(arrayList3);
                return s3q0.a;
            case 11:
                List list = (List) obj4;
                m680.a aVar2 = (m680.a) obj3;
                m680 m680Var = (m680) obj2;
                VKList vKList = (VKList) obj;
                ArrayList arrayList4 = new ArrayList(c5g.u(vKList, 10));
                Iterator<T> it3 = vKList.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(new PhotoAttachment((Photo) it3.next()));
                }
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    list.add(new EntryAttachment((PhotoAttachment) it4.next(), null, null, null, 14, null));
                }
                if (vKList.isEmpty()) {
                    aVar2.d = Integer.valueOf(list.size());
                }
                ImageViewer.c<AttachmentWithMedia> cVar2 = m680Var.g;
                if (cVar2 != null) {
                    cVar2.c(arrayList4);
                }
                return s3q0.a;
            case 12:
                PostingCountersModel.a aVar3 = (PostingCountersModel.a) obj4;
                com.vk.profile.core.info_items.a aVar4 = (com.vk.profile.core.info_items.a) obj3;
                PostingCountersModel.b bVar2 = (PostingCountersModel.b) obj2;
                PostingCountersModel.ClickActionType clickActionType = aVar3 != null ? aVar3.c : null;
                if (clickActionType != null) {
                    aVar4.v6(clickActionType, bVar2);
                }
                return s3q0.a;
            case 13:
                return new hph0((ViewGroup) obj, (u8) obj4, (defpackage.j) obj3, ((gph0) obj2).h);
            default:
                nvn0 nvn0Var = (nvn0) obj4;
                String str3 = (String) obj2;
                List list2 = (List) obj;
                ArrayList W = nvn0Var.W(list2, false);
                ArrayList arrayList5 = new ArrayList();
                Iterator it5 = ((List) obj3).iterator();
                while (it5.hasNext()) {
                    xvn0 Z = nvn0Var.Z((wvn0) it5.next(), W, list2);
                    if (Z != null) {
                        arrayList5.add(Z);
                    }
                }
                nvn0Var.T(new awn0.c(new y2j0.a(false, str3, 0, arrayList5, nvn0Var.k, nvn0Var.l, list2), new t0j0.a(W, z)));
                return s3q0.a;
        }
    }

    public /* synthetic */ vh9(imb imbVar, ActionLink actionLink, int i, UserId userId, nzb.d dVar) {
        this.b = 4;
        this.c = imbVar;
        this.d = actionLink;
        this.e = dVar;
    }

    public /* synthetic */ vh9(irb irbVar, Ref$ObjectRef ref$ObjectRef, oub oubVar) {
        this.b = 2;
        this.d = irbVar;
        this.c = ref$ObjectRef;
        this.e = oubVar;
    }
}
