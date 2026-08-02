package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.image.VKImageController;
import com.vk.core.ui.themes.VKReplacerView;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.divider.VkSeparator;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.components.text.expandable.VkExpandableText;
import com.vk.core.view.components.userstack.VkUserStack;
import com.vk.external.miniapp.net.app.ProfileItem;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.external.miniapp.net.app.WebAppPlaceholderInfo;
import com.vk.external.miniapp.net.app.WebFriendsUseApp;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.external.miniapp.net.app.WebLegalInfo;
import com.vk.external.miniapp.net.app.WebPhoto;
import com.vk.external.miniapp.net.app.WebPolicies;
import com.vk.superapp.browser.error.ApplicationNotAvailableException;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.gko;
import xsna.k1u0;
import xsna.tlo0;

/* compiled from: VkUiViewProcessorImpl.kt */
/* loaded from: classes6.dex */
public final class sxv0 implements rxv0 {
    public static final int b = iah0.a(96);
    public static final int c = iah0.a(16);
    public oao0 a;

    /* compiled from: VkUiViewProcessorImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WebAppPlaceholderInfo.Reason.values().length];
            try {
                iArr[WebAppPlaceholderInfo.Reason.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WebAppPlaceholderInfo.Reason.NOT_AVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WebAppPlaceholderInfo.Reason.BLOCKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.rxv0
    public final void a(View view, WebApiApplication webApiApplication, qqt0 qqt0Var, gbt0 gbt0Var) {
        VkText vkText;
        WebPolicies webPolicies;
        WebPolicies webPolicies2;
        String str;
        String str2;
        if (webApiApplication != null) {
            String str3 = webApiApplication.c;
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.vk_apps_icon_cancel);
            VKReplacerView vKReplacerView = (VKReplacerView) view.findViewById(R.id.vk_apps_install_game_image);
            VkText vkText2 = (VkText) view.findViewById(R.id.vk_apps_install_title);
            VkText vkText3 = (VkText) view.findViewById(R.id.vk_apps_install_subtitle);
            VkUserStack vkUserStack = (VkUserStack) view.findViewById(R.id.vk_apps_install_userstack);
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.vk_apps_install_game_screenshots);
            VkExpandableText vkExpandableText = (VkExpandableText) view.findViewById(R.id.vk_apps_install_description);
            VkCell vkCell = (VkCell) view.findViewById(R.id.vk_apps_install_dev_info);
            VkSimpleButton vkSimpleButton = (VkSimpleButton) view.findViewById(R.id.vk_apps_install_button);
            VkText vkText4 = (VkText) view.findViewById(R.id.vk_apps_install_policy);
            VkText vkText5 = (VkText) view.findViewById(R.id.vk_apps_game_name);
            VkSeparator vkSeparator = (VkSeparator) view.findViewById(R.id.vk_apps_install_separator);
            if (vkSimpleButton != null) {
                vkText = vkText4;
                vkSimpleButton.setOnClickListener(new og(qqt0Var, 10));
            } else {
                vkText = vkText4;
            }
            if (appCompatImageView != null) {
                appCompatImageView.setOnClickListener(new oyt(gbt0Var, 11));
            }
            if (vkText5 != null) {
                vkText5.setText(str3);
            }
            String str4 = webApiApplication.d.a(b).b;
            String str5 = null;
            if (!drm0.N(str4)) {
                ifx0 ifx0Var = e370.c;
                if (ifx0Var == null) {
                    ifx0Var = null;
                }
                VKImageController<View> create = ifx0Var.b().create(view.getContext());
                if (vKReplacerView != null) {
                    vKReplacerView.a(((com.vk.core.ui.image.c) create).getView());
                }
                create.f(str4, new VKImageController.b(16.0f, null, false, 0, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, null, null, 65530));
            }
            WebFriendsUseApp webFriendsUseApp = webApiApplication.L;
            if (webFriendsUseApp != null) {
                if (vkUserStack != null) {
                    vkUserStack.setVisibility(0);
                }
                if (vkUserStack != null) {
                    vkUserStack.setSize(VkUserStack.Size.Small);
                    tlo0.a aVar = tlo0.Companion;
                    String str6 = webFriendsUseApp.b;
                    aVar.getClass();
                    vkUserStack.setText(new tlo0.h(str6));
                    List H0 = j5g.H0(webFriendsUseApp.c, 3);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = H0.iterator();
                    while (it.hasNext()) {
                        WebImageSize e = ((ProfileItem) it.next()).c.e(c);
                        if (e == null || (str2 = e.b) == null) {
                            str2 = null;
                        }
                        if (str2 != null) {
                            arrayList.add(str2);
                        }
                    }
                    ifx0 ifx0Var2 = e370.c;
                    if (ifx0Var2 == null) {
                        ifx0Var2 = null;
                    }
                    vkUserStack.getContext();
                    ifx0Var2.getClass();
                    ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        itj0.d((String) it2.next(), arrayList2);
                    }
                    vkUserStack.setAvatars(arrayList2);
                }
            } else if (vkUserStack != null) {
                f4m.j(vkUserStack);
            }
            List<WebPhoto> list = webApiApplication.e0;
            List<WebPhoto> list2 = list;
            if (list2 == null || list2.isEmpty()) {
                if (recyclerView != null) {
                    f4m.j(recyclerView);
                }
                if (vkSeparator != null) {
                    vkSeparator.setVisibility(0);
                }
            } else {
                if (recyclerView != null) {
                    recyclerView.setVisibility(0);
                }
                if (vkSeparator != null) {
                    f4m.j(vkSeparator);
                }
                if (recyclerView != null) {
                    Context context = recyclerView.getContext();
                    HashSet hashSet = iah0.a;
                    boolean d = fnj.d(context);
                    WebImageSize webImageSize = (WebImageSize) j5g.Y(((WebPhoto) j5g.Y(list)).b.b);
                    boolean z = webImageSize.d <= webImageSize.c;
                    int a2 = (d || !z) ? (d || z) ? (d && z) ? iah0.a(300) : iah0.a(600) : iah0.a(328) : iah0.a(160);
                    z7t z7tVar = new z7t(z ? a2 * 2 : a2 / 2, a2);
                    recyclerView.getContext();
                    recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
                    recyclerView.setAdapter(z7tVar);
                    z7tVar.setItems(list);
                }
            }
            if (vkText2 != null) {
                vkText2.setText(str3);
            }
            if (vkText3 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(webApiApplication.l);
                sb.append(" ·");
                Context context2 = vkText3.getContext();
                int i = webApiApplication.i;
                sb.append(i >= 1000000 ? context2.getString(R.string.vk_apps_install_screen_millions_player, Integer.valueOf(i / 1000000)) : i >= 1000 ? context2.getString(R.string.vk_apps_install_screen_thousands_player, Integer.valueOf(i / 1000)) : enj.f(R.plurals.vk_apps_install_screen_members, i, context2));
                vkText3.setText(sb.toString());
            }
            String str7 = webApiApplication.g;
            if (str7 != null) {
                if (vkExpandableText != null) {
                    vkExpandableText.setText(str7);
                    vkExpandableText.setMaxCollapsedLines(4);
                    vkExpandableText.setGradientColorAttrRes(R.attr.vk_ui_background_content);
                    vkExpandableText.setExpandButton(new VkExpandableText.a(tq.h(tlo0.Companion, R.string.vk_apps_install_screen_show_more), new x7g(R.attr.vk_ui_text_subhead), dbg0.a(R.font.vk_roboto_regular, vkExpandableText.getContext()), new j8n0(vkExpandableText, 24), 16));
                }
                if (vkExpandableText != null) {
                    vkExpandableText.o();
                }
            }
            WebLegalInfo webLegalInfo = webApiApplication.c0;
            if (webLegalInfo != null && (str = webLegalInfo.b) != null && str.length() != 0) {
                if (vkCell != null) {
                    vkCell.setVisibility(0);
                }
                if (vkCell != null) {
                    vkCell.setOnClickListener(new brg(4, vkCell, webLegalInfo));
                    VkCell.Middle.a aVar2 = VkCell.Middle.Companion;
                    tlo0.a aVar3 = tlo0.Companion;
                    vkCell.setMiddle(VkCell.Middle.a.a(aVar2, new VkCell.Middle.e(oq.d(aVar3, str), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), new VkCell.Middle.d(new tlo0.f(R.string.vk_apps_install_screen_developer), (gzs) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62), null, 12));
                    VkCell.Right.c cVar = VkCell.Right.Companion;
                    gko.b bVar = gko.Companion;
                    x7g x7gVar = new x7g(R.attr.vk_ui_icon_tertiary);
                    aVar3.getClass();
                    vkCell.setRight(VkCell.Right.c.a(cVar, null, new VkCell.Right.e.b((dko) new gko(R.drawable.vk_icon_chevron_compact_right_24), (k1u0) new k1u0.a(x7gVar), (Size) null, (tlo0) new tlo0.f(R.string.vk_apps_install_screen_about_developer_more_accessibility), false, (gzs) new com.vk.movika.tools.controls.seekbar.g(22, vkCell, webLegalInfo), 20), null, null, 29));
                }
            } else if (vkCell != null) {
                f4m.j(vkCell);
            }
            if (vkText != null) {
                VkText vkText6 = vkText;
                oao0 oao0Var = new oao0(krv0.m(R.attr.vk_ui_text_accent, vkText.getContext()), krv0.m(R.attr.vk_ui_transparent, vkText.getContext()), new iyd0(vkText6, 24), false);
                this.a = oao0Var;
                oao0Var.a(vkText6);
                oao0 oao0Var2 = this.a;
                if (oao0Var2 != null) {
                    Context context3 = vkText6.getContext();
                    String str8 = (webLegalInfo == null || (webPolicies2 = webLegalInfo.d) == null) ? null : webPolicies2.c;
                    if (webLegalInfo != null && (webPolicies = webLegalInfo.d) != null) {
                        str5 = webPolicies.b;
                    }
                    oao0Var2.d(context3.getString(R.string.vk_apps_install_screen_policy, str8, str5));
                }
            }
        }
    }

    @Override // xsna.rxv0
    public final void b(View view, Throwable th, m5o0 m5o0Var) {
        int i;
        View findViewById = view.findViewById(R.id.vk_internal_app_back_button);
        View findViewById2 = view.findViewById(R.id.vk_close_button);
        ImageView imageView = (ImageView) view.findViewById(R.id.vk_app_error_icon);
        TextView textView = (TextView) view.findViewById(R.id.vk_apps_error_text);
        TextView textView2 = (TextView) view.findViewById(R.id.vk_apps_error_description);
        View findViewById3 = view.findViewById(R.id.vk_apps_error_retry);
        if (th instanceof ApplicationNotAvailableException) {
            WebAppPlaceholderInfo d = ((ApplicationNotAvailableException) th).d();
            String str = d.b;
            String str2 = d.c;
            boolean N = drm0.N(str);
            boolean z = !N;
            boolean N2 = drm0.N(str2);
            boolean z2 = !N2;
            int i2 = a.$EnumSwitchMapping$0[d.d.ordinal()];
            if (i2 == 1) {
                i = R.drawable.vk_icon_globe_cross_outline_56;
            } else if (i2 == 2) {
                i = R.drawable.vk_icon_lock_outline_56;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R.drawable.vk_icon_report_outline_56;
            }
            if (imageView != null) {
                imageView.setImageResource(i);
            }
            if (imageView != null) {
                f4m.q(!N ? iah0.a(12) : !N2 ? iah0.a(4) : iah0.a(12), imageView);
            }
            if (textView != null) {
                awt0.v(textView, z);
                textView.setText(d.b);
            }
            if (textView2 != null) {
                awt0.v(textView2, z2);
                textView2.setText(str2);
            }
            if (findViewById3 != null) {
                findViewById3.setVisibility(8);
            }
            if (findViewById2 != null) {
                awt0.v(findViewById2, true);
            }
            if (findViewById2 != null) {
                findViewById2.setOnClickListener(new cnw(m5o0Var, 11));
            }
        } else {
            if (imageView != null) {
                imageView.setImageResource(R.drawable.vk_icon_globe_cross_outline_56);
                f4m.q(iah0.a(12), imageView);
            }
            if (textView != null) {
                awt0.v(textView, true);
                textView.setText(R.string.vk_apps_loading_error_simple);
            }
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            if (findViewById3 != null) {
                awt0.v(findViewById3, true);
            }
            if (findViewById2 != null) {
                findViewById2.setVisibility(8);
            }
        }
        if (findViewById != null) {
            findViewById.setOnClickListener(new q3(m5o0Var, 17));
        }
    }

    @Override // xsna.rxv0
    public final void onDestroyView() {
        oao0 oao0Var = this.a;
        if (oao0Var != null) {
            oao0Var.b();
        }
    }
}
