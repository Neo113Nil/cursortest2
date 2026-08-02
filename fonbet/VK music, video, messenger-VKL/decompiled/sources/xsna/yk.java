package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.catalog.mvi.section.domain.CatalogFilterOptionDo;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.ui.mvp.holder.placeholder.ComposePlaceholderVh;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.CellLeftTooltipType;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.ecomm.onlinebooking.impl.calendar.BookingCalendarScreenState;
import com.vk.newsfeed.posting.privacy_picker.model.PrivacyPostType;
import com.vk.onboarding.api.stat.VkOnboardingStat$Delegate;
import com.vk.permission.PermissionHelper;
import com.vk.profile.community.creationonboarding.api.models.OnBoardingTask;
import com.vk.superapp.browser.internal.commands.controller.VkUiCommand;
import com.vk.superapp.ui.widgets.SuperAppShowcaseConfirmNumberWidget;
import com.vk.voip.ui.accessibility.AccessibilityEvents;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.Pair;
import xsna.cck;
import xsna.e8v0;
import xsna.olh0;
import xsna.wed0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class yk implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yk(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Context context;
        ExposedFunction invoke$lambda$6;
        dvv0 a;
        switch (this.b) {
            case 0:
                AccessibilityEvents accessibilityEvents = (AccessibilityEvents) this.c;
                String str = (String) this.d;
                accessibilityEvents.c("generalAnnounce(" + str + ')');
                ArrayList arrayList = accessibilityEvents.h;
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                    accessibilityEvents.f();
                    break;
                } else {
                    break;
                }
            case 1:
                ((izs) this.c).invoke(((BookingCalendarScreenState.a) this.d).b);
                break;
            case 2:
                VideoFile videoFile = (VideoFile) this.c;
                nlh0 nlh0Var = (nlh0) this.d;
                if (videoFile instanceof ClipVideoFile) {
                    nlh0Var.d(Collections.singletonList(new olh0.d(true)));
                }
                break;
            case 3:
                ((izs) this.c).invoke(((zc0) this.d).g);
                break;
            case 4:
                ComposePlaceholderVh composePlaceholderVh = (ComposePlaceholderVh) this.c;
                UIBlockPlaceholder uIBlockPlaceholder = (UIBlockPlaceholder) this.d;
                VkPlaceholder vkPlaceholder = composePlaceholderVh.c;
                if (vkPlaceholder != null && (context = vkPlaceholder.getContext()) != null) {
                    com.vk.catalog2.common.ui.mvp.util.a.e(composePlaceholderVh.b, context, uIBlockPlaceholder, composePlaceholderVh.d, null, 56);
                }
                break;
            case 5:
                t8j t8jVar = (t8j) this.c;
                com.vk.im.ui.components.contacts.c cVar = (com.vk.im.ui.components.contacts.c) this.d;
                qtd0 qtd0Var = t8jVar.b;
                com.vk.im.engine.models.contacts.a aVar = qtd0Var instanceof com.vk.im.engine.models.contacts.a ? (com.vk.im.engine.models.contacts.a) qtd0Var : null;
                if (aVar != null) {
                    cVar.j.k().g(cVar.l, Collections.singletonList(aVar.b));
                    com.vk.metrics.eventtracking.b.a.m("search", "UI.IM.INVITE_TO_VKME", "entry_point");
                }
                break;
            case 6:
                ((izs) this.c).invoke(new cck.b((OnBoardingTask) this.d));
                break;
            case 7:
                ((izs) this.c).invoke((CellLeftTooltipType) this.d);
                break;
            case 8:
                hgm hgmVar = (hgm) this.c;
                ViewGroup viewGroup = (ViewGroup) this.d;
                Context context2 = hgmVar.d;
                VkText vkText = new VkText(context2, null, 6, 0);
                Pair pair = new Pair(Integer.valueOf(R.style.VkUiTypography_ParagraphNormal), Integer.valueOf(R.attr.vk_ui_text_accent_themed));
                int intValue = ((Number) pair.d()).intValue();
                int intValue2 = ((Number) pair.g()).intValue();
                vkText.setTextAppearance(intValue);
                vkText.setTextColor(e3m.f(intValue2, context2));
                vkText.setIncludeFontPadding(true);
                vkText.setSingleLine(true);
                vkText.setEllipsize(TextUtils.TruncateAt.END);
                vkText.setLayoutParams(egm.W(hgmVar, 0, 0, 0, 0, 0, 0, 63));
                viewGroup.addView(vkText);
                break;
            case 9:
                ((izs) this.c).invoke((CatalogFilterOptionDo) this.d);
                break;
            case 10:
                invoke$lambda$6 = HandleInvocationsFromAdViewer.invoke$lambda$6((AdObject) this.c, (HandleInvocationsFromAdViewer) this.d);
                break;
            case 11:
                ((izs) this.c).invoke(new wed0.b((PrivacyPostType) this.d));
                break;
            case 12:
                kdn0 kdn0Var = (kdn0) this.c;
                ldn0 ldn0Var = (ldn0) this.d;
                u7n0 u7n0Var = kdn0Var.p;
                SuperAppShowcaseConfirmNumberWidget superAppShowcaseConfirmNumberWidget = ldn0Var.e;
                u7n0Var.e0(superAppShowcaseConfirmNumberWidget.j, superAppShowcaseConfirmNumberWidget.o.k);
                u7n0 u7n0Var2 = kdn0Var.p;
                SuperAppShowcaseConfirmNumberWidget superAppShowcaseConfirmNumberWidget2 = ldn0Var.e;
                u7n0Var2.i0(superAppShowcaseConfirmNumberWidget2.j);
                u7n0Var2.Y0(superAppShowcaseConfirmNumberWidget2.o.f);
                break;
            case 13:
                FragmentActivity fragmentActivity = (FragmentActivity) this.c;
                g7q0 g7q0Var = (g7q0) this.d;
                PermissionHelper permissionHelper = PermissionHelper.a;
                permissionHelper.getClass();
                PermissionHelper.l(permissionHelper, fragmentActivity, PermissionHelper.b, new com.vk.movika.tools.controls.seekbar.g(20, fragmentActivity, g7q0Var), new iyd0(g7q0Var, 10), 4);
                break;
            case 14:
                ((izs) this.c).invoke(((hze) this.d).a);
                break;
            case 15:
                VkOnboardingStat$Delegate vkOnboardingStat$Delegate = (VkOnboardingStat$Delegate) this.c;
                gzs gzsVar = (gzs) this.d;
                if (vkOnboardingStat$Delegate != null) {
                    vkOnboardingStat$Delegate.d4(e8v0.g.b);
                }
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                break;
            default:
                qgx0 qgx0Var = (qgx0) this.c;
                String str2 = (String) this.d;
                ovv0 J = qgx0Var.b.J();
                if (J != null && (a = J.a(VkUiCommand.INSTALL_BUNDLE)) != null) {
                    a.a(str2);
                }
                break;
        }
        return s3q0.a;
    }
}
