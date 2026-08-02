package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.unity3d.ads.core.extensions.ContextExtensionsKt;
import com.vk.auth.emailactualization.EmailActualizationMetadataResult;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionGoToOwner;
import com.vk.catalog2.common.ui.mvp.holder.header.toolbar.ToolbarRedesignVh;
import com.vk.catalog2.common.ui.mvp.holder.placeholder.ComposePlaceholderVh;
import com.vk.clips.attachments.api.publish.cta.ClipInvolvementActionButton;
import com.vk.content.design.view.photo.flow.PhotoFlowToolbarView;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.tips.TipAnchorView;
import com.vk.core.view.components.context.menu.e;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.photo.Photo;
import com.vk.im.ui.components.common.AvatarAction;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.navigation.NavigationDelegateActivity;
import com.vk.newsfeed.impl.fragments.BaseCommentsFragment;
import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.newsfeed.posting.music_picker.presentation.model.MusicPickerListItem;
import com.vk.pending.PendingPhotoAttachment;
import com.vk.photos.ui.editalbum.domain.a;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.superapp.ui.widgets.SuperAppShowcaseConfirmNumberWidget;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.bex0;
import xsna.bxp0;
import xsna.ikv0;
import xsna.o0r0;
import xsna.vwb;
import xsna.wqs0;
import xsna.xpb;
import xsna.znc;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class m84 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m84(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r2 != false) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v26, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r1v34, types: [T, com.vk.core.view.components.context.menu.VkContextMenu] */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r3v0, types: [xsna.ikv0$d$a, xsna.ikv0$d$b] */
    /* JADX WARN: Type inference failed for: r3v14, types: [xsna.bpn0] */
    /* JADX WARN: Type inference failed for: r3v16 */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Context context;
        PostingUserMessage postingUserMessage;
        File unityAdsDataStoreFile;
        boolean z;
        ?? r2;
        int i = this.b;
        int i2 = 6;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                o84 o84Var = (o84) obj2;
                Photo e = o84Var.e((PendingPhotoAttachment) obj);
                if (e != null) {
                    o84Var.j(0, Collections.singletonList(e));
                }
                return s3q0.a;
            case 1:
                int i3 = BaseCommentsFragment.l0;
                ((afg) obj2).wg((iag) obj, false);
                return s3q0.a;
            case 2:
                ((rcb) obj2).o.p((AvatarAction) obj);
                return s3q0.a;
            case 3:
                return ((wgb) obj2).s + ": loadNextFromNetwork: starting fetch from network since=" + ((aeb) obj);
            case 4:
                ((xpb.a) obj2).l.b((vwb.c) obj);
                return s3q0.a;
            case 5:
                ((izs) obj2).invoke(((znc.a) obj).a);
                return s3q0.a;
            case 6:
                Intent intent = (Intent) obj2;
                com.vk.attachpicker.screen.f fVar = (com.vk.attachpicker.screen.f) obj;
                if (intent != null && fVar.d() != null) {
                    fVar.j.getClass();
                    j34 c = rwi.d().p().c(fVar.d());
                    if (c != null) {
                        c.V2(intent);
                    }
                }
                return s3q0.a;
            case 7:
                ComposePlaceholderVh composePlaceholderVh = (ComposePlaceholderVh) obj2;
                UIBlockPlaceholder uIBlockPlaceholder = (UIBlockPlaceholder) obj;
                VkPlaceholder vkPlaceholder = composePlaceholderVh.c;
                if (vkPlaceholder != null && (context = vkPlaceholder.getContext()) != null) {
                    com.vk.catalog2.common.ui.mvp.util.a.e(composePlaceholderVh.b, context, uIBlockPlaceholder, composePlaceholderVh.e, null, 56);
                }
                return s3q0.a;
            case 8:
                qcy<Object>[] qcyVarArr = com.vk.im.ui.components.contacts.c.C;
                ((com.vk.im.ui.components.contacts.c) obj2).Z0((CharSequence) obj);
                return s3q0.a;
            case 9:
                ((izs) obj2).invoke((ClipInvolvementActionButton) obj);
                return s3q0.a;
            case 10:
                hgm hgmVar = (hgm) obj2;
                ?? r1 = (ViewGroup) obj;
                Context context2 = hgmVar.d;
                VkText vkText = new VkText(context2, null, 6, 0);
                Pair pair = new Pair(Integer.valueOf(R.style.VkUiTypography_ParagraphNormal), Integer.valueOf(R.attr.vk_ui_text_accent_themed));
                int intValue = ((Number) pair.d()).intValue();
                int intValue2 = ((Number) pair.g()).intValue();
                vkText.setTextAppearance(intValue);
                vkText.setTextColor(e3m.f(intValue2, context2));
                vkText.setSingleLine(true);
                vkText.setEllipsize(TextUtils.TruncateAt.END);
                vkText.setIncludeFontPadding(true);
                vkText.setLayoutParams(egm.W(hgmVar, 0, 0, 0, 0, 0, 0, 63));
                vkText.setTranslationY(hgmVar.w0);
                vkText.setVisibility(8);
                r1.addView(vkText);
                return vkText;
            case 11:
                mhy.b(((PhotoFlowToolbarView) obj2).getContext());
                ((kzo) obj).b.invoke(a.f.b);
                return s3q0.a;
            case 12:
                FragmentImpl fragmentImpl = (FragmentImpl) obj2;
                fragmentImpl.x = false;
                if (fragmentImpl.isVisible()) {
                    fragmentImpl.Vn();
                }
                return s3q0.a;
            case 13:
                View view = (View) obj2;
                nbv nbvVar = (nbv) obj;
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                int l = krv0.l(R.attr.vk_ui_icon_accent);
                view.getContext();
                e.b bVar = new e.b(view, null, null, l, 6);
                bVar.w = R.layout.ds_internal_context_menu_item;
                bVar.m = cn70.b(4);
                bVar.l = new bsj0(new ya(17, ref$ObjectRef, nbvVar));
                ref$ObjectRef.element = bVar.l(false);
                return s3q0.a;
            case 14:
                ((izs) obj2).invoke(new yr40(((MusicPickerListItem.MusicTrackItem) ((MusicPickerListItem) obj)).b));
                return s3q0.a;
            case 15:
                izs izsVar = (izs) obj2;
                ActionsAvailabilityState.Availability availability = (ActionsAvailabilityState.Availability) obj;
                PostingAction.Publish.PublishPostClicked publishPostClicked = PostingAction.Publish.PublishPostClicked.b;
                if (availability instanceof ActionsAvailabilityState.Availability.Available) {
                    izsVar.invoke(publishPostClicked);
                } else if ((availability instanceof ActionsAvailabilityState.Availability.NotAvailable) && (postingUserMessage = ((ActionsAvailabilityState.Availability.NotAvailable) availability).b) != null) {
                    izsVar.invoke(new PostingAction.ShowMessage(postingUserMessage, publishPostClicked, 0, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, null));
                }
                return s3q0.a;
            case 16:
                kdn0 kdn0Var = (kdn0) obj2;
                ldn0 ldn0Var = (ldn0) obj;
                u7n0 u7n0Var = kdn0Var.p;
                SuperAppShowcaseConfirmNumberWidget superAppShowcaseConfirmNumberWidget = ldn0Var.e;
                u7n0Var.e0(superAppShowcaseConfirmNumberWidget.j, superAppShowcaseConfirmNumberWidget.o.l);
                kdn0Var.p.f0(ldn0Var.e.o.g);
                return s3q0.a;
            case 17:
                Handler handler = (Handler) obj2;
                int i4 = TipAnchorView.m;
                handler.postDelayed(new qe9(7, handler, (b990) obj), 100L);
                return s3q0.a;
            case 18:
                ToolbarRedesignVh toolbarRedesignVh = (ToolbarRedesignVh) obj2;
                UIBlockActionGoToOwner uIBlockActionGoToOwner = (UIBlockActionGoToOwner) obj;
                bpn0 bpn0Var = xwk.b;
                ((o0r0) (bpn0Var != null ? bpn0Var : 0).getValue()).m(toolbarRedesignVh.b(), uIBlockActionGoToOwner.g, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, 65534));
                return s3q0.a;
            case 19:
                Bundle bundle = (Bundle) obj;
                NavigationDelegateActivity navigationDelegateActivity = ((ww50) obj2).b;
                if (p90.e(navigationDelegateActivity)) {
                    return s3q0.a;
                }
                EmailActualizationMetadataResult o = rte0.o(bundle);
                if (o == null) {
                    return s3q0.a;
                }
                ikv0.a aVar = new ikv0.a(navigationDelegateActivity);
                int i5 = bxp0.a.$EnumSwitchMapping$0[o.ordinal()];
                if (i5 == 1) {
                    aVar.t = ikv0.c.f.a;
                    aVar.u = new ikv0.d(new ikv0.d.c(navigationDelegateActivity.getString(R.string.vk_email_actualization_result_success)), (ikv0.d.b) r3, (ikv0.d.a) r3, i2);
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar.t = ikv0.c.b.a;
                    aVar.u = new ikv0.d(new ikv0.d.c(navigationDelegateActivity.getString(R.string.vk_email_actualization_result_error)), (ikv0.d.b) r3, (ikv0.d.a) r3, i2);
                }
                if (pkv0.f(aVar) != null) {
                    bundle.putString("email_actualization_result_key", null);
                }
                return s3q0.a;
            case 20:
                unityAdsDataStoreFile = ContextExtensionsKt.unityAdsDataStoreFile((Context) obj2, (String) obj);
                return unityAdsDataStoreFile;
            case 21:
                ((jsr0) obj2).l.j((String) obj);
                return s3q0.a;
            case 22:
                ((izs) obj2).invoke(new wqs0.o.b((BlockId.CompositeId) obj));
                return s3q0.a;
            default:
                qgx0 qgx0Var = (qgx0) obj2;
                onx onxVar = qgx0Var.a;
                String str = (String) obj;
                L l2 = L.a;
                LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
                l2.getClass();
                if (L.m(loggerOutputTarget)) {
                    bex0.a.a(onxVar, JsApiMethodType.GET_CLIENT_LOGS, VkAppsErrors.Client.UNKNOWN_ERROR, null, null, null, 60);
                } else {
                    l2.getClass();
                    String z2 = L.z();
                    v7r v7rVar = L.h;
                    if (v7rVar == null) {
                        v7rVar = null;
                    }
                    try {
                        z = v7rVar.c.exists();
                    } catch (SecurityException unused) {
                        z = false;
                    }
                    if (z) {
                        if (z2 != null && z2.length() != 0) {
                            r2 = false;
                            break;
                        } else {
                            r2 = true;
                            break;
                        }
                    }
                    z2 = null;
                    if (z2 == null) {
                        bex0.a.a(onxVar, JsApiMethodType.GET_CLIENT_LOGS, VkAppsErrors.Client.UNKNOWN_ERROR, null, null, null, 60);
                    } else {
                        String optString = new JSONObject(str).optString(DownloadModel.FILE_NAME);
                        String j0 = drm0.j0(optString, DomExceptionUtils.SEPARATOR, optString);
                        if (!(j0.length() == 0)) {
                            optString = j0;
                        }
                        String optString2 = new JSONObject(str).optString(ApiProtocol.KEY_UPLOAD_URL);
                        Context context3 = e43.a;
                        File file = new File((context3 != null ? context3 : null).getCacheDir(), optString.concat(".zip"));
                        new File(z2).renameTo(file);
                        com.vk.upload.impl.tasks.h hVar = new com.vk.upload.impl.tasks.h(o25.a().c(), file.getAbsolutePath(), optString2);
                        com.vk.upload.impl.a.h(hVar, new yf7(hVar, qgx0Var, file, 9));
                    }
                }
                return s3q0.a;
        }
    }
}
