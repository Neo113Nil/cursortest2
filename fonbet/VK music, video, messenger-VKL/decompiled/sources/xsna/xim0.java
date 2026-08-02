package xsna;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.util.Base64;
import android.view.View;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.api.generated.situationalSuggests.dto.SituationalSuggestsGetByIdResponseDto;
import com.vk.api.generated.situationalSuggests.dto.SituationalSuggestsThemeDto;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarSearchQueryVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogHeaderDebrandedVh;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.stories.model.clickable.ClickableSituationalTemplate;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.money.createtransfer.input.TransferInputField;
import com.vk.money.createtransfer.input.TransferInputFieldView;
import com.vk.superapp.api.dto.story.WebStickerType;
import com.vk.superapp.ui.VkTextFieldView;
import com.vk.superapp.vkpay.checkout.core.ui.views.VkCardForm;
import com.vk.video.profile.presentation.VideoProfileFragmentOld;
import com.vk.video.profile.presentation.a;
import com.vk.video.profile.presentation.views.VideoNewProfileHeaderViewV2;
import com.vk.voip.ui.calls.presentation.feature.handler.VoipCallServiceBannerHandler;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.bcw0;
import xsna.lgw0;
import xsna.lyr0;
import xsna.t0d;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class xim0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xim0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        View view = null;
        switch (this.b) {
            case 0:
                ClickableSituationalTemplate clickableSituationalTemplate = (ClickableSituationalTemplate) this.c;
                String e = ((SituationalSuggestsThemeDto) j5g.Y(((SituationalSuggestsGetByIdResponseDto) obj).d())).e();
                if (e == null || (str = drm0.p0(e).toString()) == null) {
                    str = "";
                }
                JSONObject jSONObject = new JSONObject(str);
                JSONArray jSONArray = jSONObject.getJSONArray("stickers");
                if (jSONArray != null) {
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i).getJSONObject("sticker");
                        if (epx.f(f370.D(jSONObject2, "action_type"), WebStickerType.SITUATIONAL_TEMPLATE.i())) {
                            JSONObject jSONObject3 = new JSONObject();
                            ClickableSituationalTemplate.RepliedUsersInfo repliedUsersInfo = clickableSituationalTemplate.f;
                            jSONObject3.put("count", repliedUsersInfo != null ? Integer.valueOf(repliedUsersInfo.b) : null);
                            JSONArray jSONArray2 = new JSONArray();
                            ClickableSituationalTemplate.RepliedUsersInfo repliedUsersInfo2 = clickableSituationalTemplate.f;
                            if (repliedUsersInfo2 != null) {
                                Iterator<T> it = repliedUsersInfo2.d.iterator();
                                while (it.hasNext()) {
                                    jSONArray2.put((String) it.next());
                                }
                            }
                            s3q0 s3q0Var = s3q0.a;
                            jSONObject3.put("avatars", jSONArray2);
                            jSONObject2.put("action", jSONObject3);
                        }
                    }
                }
                return er.a(HttpRequest.DEFAULT_SCHEME).authority(a0a.d).appendPath("new_story").appendQueryParameter("storybox", Base64.encodeToString(jSONObject.toString().getBytes(emb.b), 0)).appendQueryParameter("entry_point", "VIRAL_TEMPLATE".toLowerCase(Locale.ROOT)).build().toString();
            case 1:
                SdkClipVideoFile sdkClipVideoFile = (SdkClipVideoFile) obj;
                izs<SdkClipVideoFile, s3q0> izsVar = ((t0d.m.b) ((t0d.m) this.c)).b;
                if (izsVar != null) {
                    izsVar.invoke(sdkClipVideoFile);
                }
                return s3q0.a;
            case 2:
                xwr xwrVar = (xwr) obj;
                izs izsVar2 = (izs) ((zak0) ((TopBar$Middle.b) this.c).m).getValue();
                if (izsVar2 != null) {
                    izsVar2.invoke(Boolean.valueOf(xwrVar.h()));
                }
                return s3q0.a;
            case 3:
                CharSequence charSequence = (CharSequence) obj;
                TransferInputField.a aVar = ((TransferInputFieldView) this.c).n;
                if (aVar != null) {
                    aVar.a(charSequence.toString());
                }
                return s3q0.a;
            case 4:
                ((k7q0) this.c).P4(((View) obj).getId());
                return s3q0.a;
            case 5:
                hgr0 hgr0Var = (hgr0) this.c;
                lvv0 lvv0Var = (lvv0) obj;
                Regex regex = hgr0.X;
                ok8 Jn = hgr0Var.Jn();
                if (Jn != null) {
                    Jn.dh(lvv0Var);
                }
                return s3q0.a;
            case 6:
                gzs<s3q0> gzsVar = ((VideoCatalogHeaderDebrandedVh) this.c).i;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 7:
                lyr0.a aVar2 = (lyr0.a) this.c;
                List list = (List) obj;
                if ((list instanceof Collection) && list.isEmpty()) {
                    return aVar2;
                }
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (((hfz) it2.next()) instanceof AboutVideoItem.a0) {
                        return lyr0.a.c.a;
                    }
                }
                return aVar2;
            case 8:
                return Boolean.valueOf(dd80.f((UIBlockList) obj, new rgl0((dks0) this.c)) != null);
            case 9:
                ofc0 ofc0Var = (ofc0) this.c;
                int i2 = VideoNewProfileHeaderViewV2.y;
                ((etv0) obj).b(false);
                ofc0Var.invoke();
                return s3q0.a;
            case 10:
                VideoProfileFragmentOld videoProfileFragmentOld = (VideoProfileFragmentOld) this.c;
                int i3 = VideoProfileFragmentOld.p0;
                xn50.a.c(videoProfileFragmentOld, a.w.b);
                ((ikv0) obj).a();
                return s3q0.a;
            case 11:
                return ((tet0) this.c).getResources().getString(((ecr) obj).a());
            case 12:
                View view2 = (View) obj;
                Context context = ((nbu0) this.c).a;
                Context context2 = view2.getContext();
                if (context2 instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context2).setBaseContext(context);
                    view = view2;
                }
                if (view != null) {
                    return view;
                }
                throw new IllegalStateException("Not a mutable context!");
            case 13:
                VkCardForm vkCardForm = (VkCardForm) this.c;
                VkTextFieldView vkTextFieldView = vkCardForm.d;
                (vkTextFieldView != null ? vkTextFieldView : null).c.setBackgroundResource(R.drawable.vkui_bg_edittext);
                izs<? super VkCardForm.b, s3q0> izsVar3 = vkCardForm.f;
                if (izsVar3 != null) {
                    izsVar3.invoke(vkCardForm.getCardData());
                }
                return s3q0.a;
            case 14:
                return lcv0.f((lcv0) this.c);
            case 15:
                VkSearchView vkSearchView = (VkSearchView) this.c;
                String str2 = ((bcw0.a) obj).a;
                if (str2 != null) {
                    vkSearchView.setQuery(str2);
                    izs<String, s3q0> onVoiceInputListener = vkSearchView.getOnVoiceInputListener();
                    if (onVoiceInputListener != null) {
                        onVoiceInputListener.invoke(str2);
                    }
                }
                return s3q0.a;
            case 16:
                VkTopBarSearchQueryVh vkTopBarSearchQueryVh = (VkTopBarSearchQueryVh) this.c;
                String str3 = (String) obj;
                VkTopBarSearchQueryVh.b bVar = vkTopBarSearchQueryVh.r;
                VkTopBar.Middle.d dVar = bVar.g;
                vkTopBarSearchQueryVh.h(VkTopBarSearchQueryVh.b.a(bVar, false, null, false, null, false, dVar != null ? VkTopBar.Middle.d.a(dVar, str3, null, false, null, 4094) : null, false, null, null, 959));
                return s3q0.a;
            case 17:
                ngw0 ngw0Var = (ngw0) this.c;
                int i4 = ngw0.n1;
                xn50.a.c(ngw0Var, new lgw0.e((String) obj));
                return s3q0.a;
            default:
                ((VoipCallServiceBannerHandler) this.c).b.invoke(VoipCallServiceBannerHandler.b.a.a);
                return s3q0.a;
        }
    }

    public /* synthetic */ xim0(zim0 zim0Var, ClickableSituationalTemplate clickableSituationalTemplate) {
        this.b = 0;
        this.c = clickableSituationalTemplate;
    }
}
