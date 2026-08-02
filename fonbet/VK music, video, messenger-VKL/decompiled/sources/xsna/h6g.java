package xsna;

import android.content.Context;
import android.opengl.GLES20;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.dialogslist.impl.list.adapter.DialogsListAdapter;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.group.GroupCatalogItem;
import com.vk.dto.music.MusicTrack;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.file_picker.external.ExternalFilePickerFragment;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.ui.components.viewcontrollers.msg_list.decoration.MsgRegionImageMask;
import com.vk.imageloader.view.VKImageView;
import com.vk.instantjobs.InstantJob;
import com.vk.music.playlist.display.domain.e;
import com.vk.newsfeed.impl.presentation.newsfeed_geo.presentation.fragment.GeoPostsFragment;
import com.vk.photo.editor.views.ToolButton;
import com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.a;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vk.superapp.qr.web2app.loader.errors.AccountsLimitReachedException;
import com.vk.superapp.qr.web2app.loader.errors.WrongAuthCodeReceivedException;
import com.vk.voip.ui.groupcalls.list.ListGroupCallView;
import com.vk.voip.ui.sessionrooms.dialog.model.a;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import java.io.File;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Result;
import one.video.gl.GLESUtils;
import xsna.asb;
import xsna.cco;
import xsna.d1j;
import xsna.e4n;
import xsna.msz;
import xsna.nsz;
import xsna.qr60;
import xsna.r7x;
import xsna.x89;
import xsna.ytm;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class h6g implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h6g(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        CatalogLink catalogLink;
        Image image;
        ImageSize Cb;
        String str;
        String message;
        int i = this.b;
        int i2 = 17;
        int i3 = 4;
        r4 = null;
        r4 = null;
        r4 = null;
        String str2 = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ToolButton toolButton = (ToolButton) ((HashMap) obj2).get(Integer.valueOf(R.id.tabHsl1));
                if (toolButton != null) {
                    toolButton.setIndicatorActive(!booleanValue);
                }
                return s3q0.a;
            case 1:
                xeg xegVar = (xeg) obj2;
                xegVar.n = false;
                xegVar.l((Throwable) obj);
                return s3q0.a;
            case 2:
                c5f c5fVar = ((v0h) obj2).j;
                if (c5fVar != null) {
                    c5fVar.invoke();
                }
                return s3q0.a;
            case 3:
                ((d3h) obj2).c.d();
                return s3q0.a;
            case 4:
                ((s6h) obj2).d.a();
                return s3q0.a;
            case 5:
                ptk ptkVar = (ptk) obj;
                return ptkVar.b ? io.reactivex.rxjava3.core.q.T(ptkVar) : ((io.reactivex.rxjava3.core.q) obj2).U(new v20(new omf(ptkVar, i3), i2));
            case 6:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                LinearLayout linearLayout = ((CommunityReviewsFragment) obj2).b0;
                if (linearLayout != null) {
                    bwt0.p0(linearLayout, booleanValue2);
                }
                return s3q0.a;
            case 7:
                a.b bVar = (a.b) obj;
                ((s0j) obj2).T(new d1j.d(bVar.d, ((lvi0) j5g.X(bVar.c)).d));
                return s3q0.a;
            case 8:
                xam xamVar = (xam) obj2;
                Result result = (Result) obj;
                if (!(result.d() instanceof Result.Failure)) {
                    ktk0 ktk0Var = xamVar.t;
                    Object d = result.d();
                    ktk0Var.g = (InfoBar) (d instanceof Result.Failure ? null : d);
                }
                return s3q0.a;
            case 9:
                return new ovw((ViewGroup) obj, ((DialogsListAdapter) obj2).j);
            case 10:
                fum fumVar = (fum) obj2;
                fumVar.O(new ytm.o(((Boolean) obj).booleanValue()));
                fumVar.o.b(fumVar.h.e().subscribe(new n20(new o1e(fumVar, i2), 21)));
                return s3q0.a;
            case 11:
                u1c0 u1c0Var = (u1c0) obj;
                return Boolean.valueOf((u1c0Var instanceof k2n) && epx.f(((k2n) u1c0Var).a, (NewsEntry) obj2));
            case 12:
                e4n.a aVar = (e4n.a) obj2;
                aVar.a();
                e4n.this.e(new i4n(qr60.a.b.a));
                return s3q0.a;
            case 13:
                com.vk.music.playlist.display.domain.b bVar2 = (com.vk.music.playlist.display.domain.b) obj2;
                w71 w71Var = bVar2.y;
                yj40 yj40Var = (yj40) obj;
                if (yj40Var instanceof ib50) {
                    ib50 ib50Var = (ib50) yj40Var;
                    w71Var.a(ib50Var.b.Fb(), ib50Var.a.J);
                } else if (yj40Var instanceof gc50) {
                    LinkedHashMap linkedHashMap = ((gc50) yj40Var).a;
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(on00.e(linkedHashMap.size()));
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        linkedHashMap2.put(entry.getKey(), ((MusicTrack) entry.getValue()).J);
                    }
                    w71Var.b(linkedHashMap2);
                } else if (yj40Var instanceof b9b0) {
                    ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
                    com.vk.mvi.core.internal.executors.a.b(new gfn(bVar2, bVar2, yj40Var));
                } else if (yj40Var instanceof gcb0) {
                    ExecutorService executorService2 = com.vk.mvi.core.internal.executors.a.a;
                    com.vk.mvi.core.internal.executors.a.b(new hfn(bVar2, bVar2, yj40Var));
                } else if (yj40Var instanceof n8b0) {
                    ExecutorService executorService3 = com.vk.mvi.core.internal.executors.a.a;
                    com.vk.mvi.core.internal.executors.a.b(new ifn(bVar2, bVar2, yj40Var));
                } else if (yj40Var instanceof fi40) {
                    ExecutorService executorService4 = com.vk.mvi.core.internal.executors.a.a;
                    com.vk.mvi.core.internal.executors.a.b(new jfn(bVar2, bVar2, yj40Var));
                } else if ((yj40Var instanceof u8b0) || (yj40Var instanceof reb0)) {
                    ExecutorService executorService5 = com.vk.mvi.core.internal.executors.a.a;
                    com.vk.mvi.core.internal.executors.a.b(new kfn(bVar2, bVar2, yj40Var));
                } else if (yj40Var instanceof qeb0) {
                    bVar2.T(new e.h(((qeb0) yj40Var).b));
                }
                return s3q0.a;
            case 14:
                qgi0.h((tgi0) obj, ((cco.a) obj2).a.d);
                return s3q0.a;
            case 15:
                ExternalFilePickerFragment externalFilePickerFragment = (ExternalFilePickerFragment) obj2;
                List<? extends File> list = (List) obj;
                int i4 = ExternalFilePickerFragment.R;
                if (list != null) {
                    externalFilePickerFragment.fo(list);
                }
                return s3q0.a;
            case 16:
                UIBlockLink uIBlockLink = (UIBlockLink) obj2;
                VKImageView vKImageView = (VKImageView) obj;
                if (uIBlockLink != null && (catalogLink = uIBlockLink.y) != null && (image = catalogLink.f) != null && (Cb = image.Cb(vKImageView.getWidth(), true, false)) != null) {
                    str2 = Cb.d.d;
                }
                vKImageView.load(str2);
                return s3q0.a;
            case 17:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((zak0) ((fxt0) obj2).j).setValue(bool);
                return s3q0.a;
            case 18:
                iv8 iv8Var = (iv8) obj2;
                v1t v1tVar = (v1t) obj;
                FloatBuffer floatBuffer = (FloatBuffer) iv8Var.b;
                int i5 = v1tVar.b;
                GLES20.glEnableVertexAttribArray(i5);
                GLESUtils.c("glEnableVertexAttribArray", new int[0]);
                GLES20.glVertexAttribPointer(i5, 2, 5126, false, 8, (Buffer) floatBuffer);
                GLESUtils.c("glVertexAttribPointer", new int[0]);
                FloatBuffer floatBuffer2 = (FloatBuffer) iv8Var.c;
                int i6 = v1tVar.c;
                GLES20.glEnableVertexAttribArray(i6);
                GLESUtils.c("glEnableVertexAttribArray", new int[0]);
                GLES20.glVertexAttribPointer(i6, 2, 5126, false, 8, (Buffer) floatBuffer2);
                GLESUtils.c("glVertexAttribPointer", new int[0]);
                GLES20.glDrawArrays(5, 0, 4);
                GLESUtils.c("glDrawArrays", 1285);
                GLES20.glDisableVertexAttribArray(i5);
                GLESUtils.c("glDisableVertexAttribArray", new int[0]);
                GLES20.glDisableVertexAttribArray(i6);
                GLESUtils.c("glDisableVertexAttribArray", new int[0]);
                return s3q0.a;
            case 19:
                r3t r3tVar = (r3t) obj2;
                b.d dVar = (b.d) obj;
                StoryCameraParams storyCameraParams = r3tVar.d;
                dVar.b((storyCameraParams == null || (str = storyCameraParams.c) == null) ? null : cqm0.m(str), "creation_entry_point");
                StoryCameraParams storyCameraParams2 = r3tVar.d;
                dVar.b(storyCameraParams2 != null ? storyCameraParams2.b : null, "nav_screen");
                return s3q0.a;
            case 20:
                qcy<Object>[] qcyVarArr = GeoPostsFragment.q0;
                ((SwipeDrawableRefreshLayout) obj2).setProgressDrawableFactory((d2e0) obj);
                return s3q0.a;
            case 21:
                xau xauVar = (xau) obj2;
                tpf0 tpf0Var = (tpf0) obj;
                if (tpf0Var == MsgRegionImageMask.FULL) {
                    return xauVar.a;
                }
                if (tpf0Var == MsgRegionImageMask.TOP) {
                    return xauVar.b;
                }
                if (tpf0Var == MsgRegionImageMask.MIDDLE) {
                    return xauVar.c;
                }
                if (tpf0Var == MsgRegionImageMask.BOTTOM) {
                    return xauVar.d;
                }
                if (tpf0Var == MsgRegionImageMask.TOP_LINKED) {
                    return xauVar.e;
                }
                if (tpf0Var == MsgRegionImageMask.FULL_LINKED) {
                    return xauVar.f;
                }
                return null;
            case 22:
                ((uhu) obj2).X0(x89.d.a);
                return s3q0.a;
            case 23:
                GroupCatalogItem groupCatalogItem = (GroupCatalogItem) obj2;
                w9y w9yVar = (w9y) obj;
                w9yVar.d(Long.valueOf(groupCatalogItem.b), "id");
                w9yVar.e(groupCatalogItem.c, "description");
                w9yVar.c(Integer.valueOf(groupCatalogItem.d), "counter");
                w9yVar.e(groupCatalogItem.e, "track_code");
                w9yVar.g("friends", groupCatalogItem.f);
                w9yVar.e(groupCatalogItem.g, "city");
                double d2 = groupCatalogItem.h;
                Double valueOf = Double.valueOf(d2);
                if (Double.isNaN(d2)) {
                    valueOf = null;
                }
                w9yVar.f("latitude", valueOf);
                double d3 = groupCatalogItem.i;
                Double valueOf2 = Double.valueOf(d3);
                if (Double.isNaN(d3)) {
                    valueOf2 = null;
                }
                w9yVar.f("longitude", valueOf2);
                double d4 = groupCatalogItem.j;
                w9yVar.f(CampaignEx.JSON_KEY_STAR, Double.isNaN(d4) ? null : Double.valueOf(d4));
                return s3q0.a;
            case 24:
                return r7x.a.a((r7x.a) obj, false, (InstantJob.a.e) obj2, 3);
            case 25:
                kbx kbxVar = (kbx) obj2;
                kbxVar.performHapticFeedback(0);
                com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.f fVar = kbxVar.e;
                if (fVar != null) {
                    fVar.e2(a.C1835a.b);
                }
                return s3q0.a;
            case 26:
                asb.b bVar3 = ((bqx) obj2).h;
                if (bVar3 != null) {
                    bVar3.invoke();
                }
                return s3q0.a;
            case 27:
                float f = ListGroupCallView.o0;
                ((ListGroupCallView) obj2).c5();
                return s3q0.a;
            case 28:
                gsz gszVar = ((lsz) obj2).d;
                Throwable th = ((msz.a) obj).b;
                Context context = gszVar.a;
                boolean z = th instanceof AccountsLimitReachedException;
                String string = z ? context.getString(R.string.vk_qr_web_to_app_accounts_limit_reached_error_title) : th instanceof WrongAuthCodeReceivedException ? context.getString(R.string.vk_qr_web_to_app_error_sign_in_title) : context.getString(R.string.vk_qr_web_to_app_error_sign_in_title);
                if (z) {
                    message = context.getString(R.string.vk_qr_web_to_app_accounts_limit_reached_error_message);
                } else if (th instanceof WrongAuthCodeReceivedException) {
                    message = context.getString(R.string.vk_qr_web_to_app_error_sign_in_message);
                } else {
                    message = th.getMessage();
                    if (message == null) {
                        message = context.getString(R.string.vk_qr_web_to_app_error_sign_in_message);
                    }
                }
                return new nsz.a.C3412a(string, message);
            default:
                ((ti00) obj2).d();
                return s3q0.a;
        }
    }
}
