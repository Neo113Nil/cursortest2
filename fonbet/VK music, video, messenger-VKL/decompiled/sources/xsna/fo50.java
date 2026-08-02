package xsna;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.hint.CatalogHint;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.core.preference.Preference;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.channels.ChannelBanInfo;
import com.vk.im.engine.models.channels.ChannelNotificationsSettings;
import com.vk.im.engine.models.channels.ChannelType;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.groups.AdminLevel;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.imageloader.view.VKImageView;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.newsfeed.api.data.NewsfeedList;
import com.vk.pending.PendingDocumentAttachment;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DocumentAttachment;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Locale;
import kotlin.collections.EmptySet;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.q2o;

/* compiled from: MyAudioButtonTransformer.kt */
@ozl
/* loaded from: classes16.dex */
public class fo50 implements x3z, mba, io.reactivex.rxjava3.functions.l, axp, SuccessContinuation, o2u0 {
    public static final fo50 b = new fo50();
    public static final long[] c = new long[0];
    public static final fo50 d = new fo50();
    public static final /* synthetic */ fo50 e = new fo50();

    public static HashMap A() {
        String s = Preference.s("community_posting", "selected_authors", "");
        if (s.length() == 0) {
            return new HashMap();
        }
        JSONObject jSONObject = new JSONObject(s);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            linkedHashMap.put(next, jSONObject.get(next));
        }
        return linkedHashMap;
    }

    public static final ArrayList B() {
        ArrayList arrayList = new ArrayList(5);
        w1n.b.getClass();
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        arrayList.add(new ls60(new NewsfeedList(0, context.getString(R.string.home_tabs_feed)), R.drawable.vk_icon_newsfeed_outline_28));
        Context context2 = e43.a;
        if (context2 == null) {
            context2 = null;
        }
        arrayList.add(new ls60(new NewsfeedList(-2, context2.getString(R.string.friends)), R.drawable.vk_icon_users_outline_28));
        Context context3 = e43.a;
        arrayList.add(new ls60(new NewsfeedList(-4, (context3 != null ? context3 : null).getString(R.string.photos)), R.drawable.vk_icon_picture_outline_28));
        return arrayList;
    }

    public static hny E(int i, Context context) {
        hny hnyVar = new hny(context);
        hnyVar.d(i, R.attr.vk_ui_vkontakte_color_placeholder_icon_foreground_secondary);
        hnyVar.c(-1.0f, R.attr.vk_ui_image_placeholder);
        return hnyVar;
    }

    public static eeb G(JSONObject jSONObject, f1e0 f1e0Var, String str, int i) {
        MsgFromChannel c2;
        ChannelNotificationsSettings channelNotificationsSettings;
        ChannelBanInfo channelBanInfo;
        String str2;
        q2o q2oVar;
        q2o.a aVar;
        Peer b2;
        String str3 = (i & 4) != 0 ? null : str;
        JSONObject optJSONObject = jSONObject.optJSONObject("last_message");
        if (optJSONObject != null) {
            try {
                c2 = s1b.c(optJSONObject, f1e0Var);
            } catch (JSONException e2) {
                throw new VKApiIllegalResponseException(e2);
            }
        } else {
            c2 = null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("channel");
        long j = jSONObject2.getLong("channel_id");
        long optLong = jSONObject2.optLong("parent_id");
        Long valueOf = optLong != 0 ? Long.valueOf(optLong) : null;
        Serializer.c<Peer> cVar = Peer.CREATOR;
        f1e0Var.c(Peer.a.b(j));
        if (valueOf != null && (b2 = Peer.a.b(valueOf.longValue())) != null) {
            f1e0Var.c(b2);
        }
        String optString = jSONObject2.optString("channel_type");
        String string = jSONObject2.has("photo_base") ? jSONObject2.getString("photo_base") : "";
        String string2 = jSONObject2.has("title") ? jSONObject2.getString("title") : "";
        JSONObject jSONObject3 = jSONObject2.getJSONObject("sort_id");
        vcb vcbVar = new vcb(jSONObject3.getInt("major_id"), jSONObject3.getInt("minor_id"), j);
        JSONObject jSONObject4 = jSONObject2.getJSONObject("user_data");
        ChannelType.Companion.getClass();
        boolean z = !ad0.B(ChannelType.a.a(optString)) ? jSONObject2.optInt("is_owner") != 1 : jSONObject4.optInt("is_owner") != 1;
        JSONObject optJSONObject2 = jSONObject4.optJSONObject("notification_settings");
        if (optJSONObject2 == null) {
            channelNotificationsSettings = new ChannelNotificationsSettings(false, 0L, 3, null);
        } else {
            channelNotificationsSettings = new ChannelNotificationsSettings(optJSONObject2.optBoolean("is_enabled", false), (optJSONObject2.has("disable_duration") ? optJSONObject2.getLong("disable_duration") : 0L) * 1000);
        }
        JSONObject jSONObject5 = jSONObject4.getJSONObject("read_state");
        m7f0 m7f0Var = new m7f0(jSONObject5.getInt("read_up_to_cmid"), jSONObject5.getInt("unread_count"));
        boolean z2 = jSONObject4.getBoolean("is_archived");
        boolean optBoolean = jSONObject4.optBoolean("is_member", false);
        JSONObject optJSONObject3 = jSONObject4.optJSONObject("ban_info");
        if (optJSONObject3 != null) {
            String D = f370.D(optJSONObject3, "comment");
            Integer x = f370.x(optJSONObject3, "end_date");
            int intValue = x != null ? x.intValue() : 0;
            ChannelBanInfo.Reason.a aVar2 = ChannelBanInfo.Reason.Companion;
            Integer valueOf2 = Integer.valueOf(optJSONObject3.getInt("reason"));
            aVar2.getClass();
            channelBanInfo = new ChannelBanInfo(D, intValue, ChannelBanInfo.Reason.a.a(valueOf2));
        } else {
            channelBanInfo = null;
        }
        Boolean valueOf3 = Boolean.valueOf(jSONObject4.optBoolean("can_post"));
        AdminLevel.a aVar3 = AdminLevel.Companion;
        Integer valueOf4 = Integer.valueOf(jSONObject4.getInt("admin_level"));
        aVar3.getClass();
        mzq0 mzq0Var = new mzq0(channelNotificationsSettings, m7f0Var, z2, optBoolean, z, channelBanInfo, valueOf3, AdminLevel.a.a(valueOf4), jSONObject4.optBoolean("is_hidden_in_all_folder"), jSONObject4.optBoolean("can_post_donut"));
        long optLong2 = jSONObject2.optLong("version", -1L);
        Long valueOf5 = optLong2 != -1 ? Long.valueOf(optLong2) : null;
        int optInt = jSONObject2.optInt("postponed_count", 0);
        Integer x2 = f370.x(jSONObject2, "members_count");
        Boolean q = f370.q(jSONObject2, "can_comment");
        Boolean q2 = f370.q(jSONObject2, "is_adult");
        boolean booleanValue = q2 != null ? q2.booleanValue() : false;
        JSONObject optJSONObject4 = jSONObject2.optJSONObject("donut_settings");
        if (optJSONObject4 != null) {
            boolean optBoolean2 = optJSONObject4.optBoolean("is_one_time_payments_enabled");
            boolean optBoolean3 = optJSONObject4.optBoolean("paid_reactions_enabled");
            JSONObject optJSONObject5 = optJSONObject4.optJSONObject("paid_reactions_config");
            if (optJSONObject5 != null) {
                str2 = string;
                aVar = new q2o.a(optJSONObject5.optInt("reaction_cost"));
            } else {
                str2 = string;
                aVar = null;
            }
            q2oVar = new q2o(optBoolean2, optBoolean3, aVar);
        } else {
            str2 = string;
            q2oVar = null;
        }
        return new eeb(new yta(j, str2, string2, vcbVar, mzq0Var, optString, valueOf, valueOf5, optInt, x2, q, str3, booleanValue, q2oVar), c2);
    }

    public static final void J(iz2 iz2Var) {
        bpn0 bpn0Var = o25.a;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        if (((b25) bpn0Var.getValue()).b()) {
            return;
        }
        iz2Var.d = true;
        iz2Var.c = true;
    }

    public static final UIBlockHint K(bi20 bi20Var, CatalogHint catalogHint, CatalogExtendedData catalogExtendedData, oq8 oq8Var) {
        return new UIBlockHint(bi20Var.a, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, EmptySet.b, catalogHint.b, catalogHint.c, catalogHint.d, catalogHint.e, catalogHint.f, oq8Var.a(catalogExtendedData, catalogHint.g, bi20Var), catalogHint.h);
    }

    public static hun L(DocumentAttachment documentAttachment, int i) {
        ArrayList arrayList;
        ImageSize imageSize;
        Image image = documentAttachment.s;
        ImageSize imageSize2 = (ImageSize) ixj0.b(image != null ? image.b : null);
        int i2 = imageSize2 != null ? imageSize2.d.b : documentAttachment.l;
        int i3 = imageSize2 != null ? imageSize2.d.c : documentAttachment.m;
        if (documentAttachment instanceof PendingDocumentAttachment) {
            arrayList = null;
            imageSize = new ImageSize(documentAttachment.h, documentAttachment.l, documentAttachment.m, null, (char) 0, false, 56, null);
        } else {
            arrayList = image != null ? image.b : null;
            imageSize = null;
        }
        String str = documentAttachment.i;
        mun munVar = new mun(documentAttachment, str, str != null ? str.toUpperCase(Locale.ROOT) : null, documentAttachment.x5(), documentAttachment.n, imageSize, arrayList);
        if (i2 <= 0) {
            i2 = iah0.a(135);
        }
        int i4 = i2;
        if (i3 <= 0) {
            i3 = iah0.a(100);
        }
        return new hun(documentAttachment, munVar, i4, i3, i);
    }

    public static final dcq M(dux0 dux0Var, boolean z, boolean z2, wzs wzsVar, Source source) {
        return z ? new ecq(dux0Var) : new ubg0(dux0Var, z2, wzsVar, source);
    }

    public static final void k(final int i, final int i2, androidx.compose.runtime.a aVar, final gzs gzsVar, boolean z) {
        boolean z2;
        int i3;
        final boolean z3;
        androidx.compose.runtime.a M = aVar.M(-361453782);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            z2 = z;
        } else if ((i & 6) == 0) {
            z2 = z;
            i3 = (M.l(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.y(gzsVar) ? 32 : 16;
        }
        int i5 = 0;
        int i6 = 1;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            z3 = i4 != 0 ? true : z2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-361453782, i3, -1, "androidx.activity.compose.BackHandler (BackHandler.kt:107)");
            }
            pqo pqoVar = nvz.a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-942026292, 0, -1, "androidx.navigationevent.compose.LocalNavigationEventDispatcherOwner.<get-current> (LocalNavigationEventDispatcherOwner.kt:38)");
            }
            Object obj = (ky50) M.r(nvz.a);
            if (obj == null) {
                M.K(950836184);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-334864187, 0, -1, "androidx.navigationevent.compose.findViewTreeNavigationEventDispatcherOwner (LocalNavigationEventDispatcherOwner.android.kt:25)");
                }
                View view = (View) M.r(AndroidCompositionLocals_androidKt.f);
                while (true) {
                    if (view == null) {
                        obj = null;
                        break;
                    }
                    Object tag = view.getTag(R.id.view_tree_navigation_event_dispatcher_owner);
                    Object obj2 = tag instanceof ky50 ? (ky50) tag : null;
                    if (obj2 != null) {
                        obj = obj2;
                        break;
                    } else {
                        Object m = fvr.m(view);
                        view = m instanceof View ? (View) m : null;
                    }
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            } else {
                M.K(950834231);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (obj == null) {
                M.K(535274673);
                pqo pqoVar2 = pvz.a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-2068013981, 6, -1, "androidx.activity.compose.LocalOnBackPressedDispatcherOwner.<get-current> (BackHandler.kt:59)");
                }
                obj = (r180) M.r(pvz.a);
                if (obj == null) {
                    M.K(1208426157);
                    obj = g620.e((View) M.r(AndroidCompositionLocals_androidKt.f));
                } else {
                    M.K(1208423708);
                }
                M.j();
                if (obj == null) {
                    M.K(1208428160);
                    Object obj3 = (Context) M.r(AndroidCompositionLocals_androidKt.b);
                    while (true) {
                        if (!(obj3 instanceof ContextWrapper)) {
                            obj3 = null;
                            break;
                        } else if (obj3 instanceof r180) {
                            break;
                        } else {
                            obj3 = ((ContextWrapper) obj3).getBaseContext();
                        }
                    }
                    obj = (r180) obj3;
                } else {
                    M.K(1208423789);
                }
                M.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.K(535271790);
            }
            M.j();
            if (obj == null) {
                throw new IllegalStateException("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
            }
            boolean J = M.J(obj);
            Object x = M.x();
            Object obj4 = a.C0011a.a;
            if (J || x == obj4) {
                ky50 ky50Var = obj instanceof ky50 ? (ky50) obj : null;
                jy50 navigationEventDispatcher = ky50Var != null ? ky50Var.getNavigationEventDispatcher() : null;
                r180 r180Var = obj instanceof r180 ? (r180) obj : null;
                x = new zu5(navigationEventDispatcher, r180Var != null ? r180Var.getOnBackPressedDispatcher() : null);
                M.R(x);
            }
            Object obj5 = (zu5) x;
            long n = n34.n(M);
            boolean J2 = M.J(obj5) | M.p(n);
            Object x2 = M.x();
            Object obj6 = x2;
            if (J2 || x2 == obj4) {
                cpi cpiVar = new cpi(new av5(obj, n));
                cpiVar.c = new uz(10);
                M.R(cpiVar);
                obj6 = cpiVar;
            }
            Object obj7 = (cpi) obj6;
            M.K(-585307852);
            boolean y = M.y(obj7) | ((i3 & 112) == 32);
            Object x3 = M.x();
            if (y || x3 == obj4) {
                x3 = new eg1(i6, obj7, gzsVar);
                M.R(x3);
            }
            bap.i((gzs) x3, M, 0);
            Boolean valueOf = Boolean.valueOf(z3);
            int i7 = i3 & 14;
            boolean y2 = M.y(obj7) | (i7 == 4);
            Object x4 = M.x();
            if (y2 || x4 == obj4) {
                x4 = new bv5(obj7, z3, i5);
                M.R(x4);
            }
            o4z.a(valueOf, obj7, null, (izs) x4, M, i7);
            boolean y3 = M.y(obj5) | M.y(obj7);
            Object x5 = M.x();
            if (y3 || x5 == obj4) {
                x5 = new mm1(i6, obj5, obj7);
                M.R(x5);
            }
            bap.b(obj5, obj7, (izs) x5, M, 0);
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            z3 = z2;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.cv5
                @Override // xsna.wzs
                public final Object invoke(Object obj8, Object obj9) {
                    ((Integer) obj9).getClass();
                    fo50.k(ne7.I(i | 1), i2, (androidx.compose.runtime.a) obj8, gzsVar, z3);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void n(ArrayList arrayList, glb0 glb0Var) {
        if (epx.f(j5g.k0(arrayList), glb0Var)) {
            return;
        }
        arrayList.add(glb0Var);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static void r(VKImageView vKImageView, String str) {
        switch (str.hashCode()) {
            case -2021881618:
                if (str.equals("artist_not_transparent")) {
                    hny hnyVar = new hny(vKImageView.getContext());
                    hnyVar.a(-1.0f, R.color.vk_gray_50);
                    hnyVar.d(R.drawable.vk_icon_music_mic_20, R.attr.vk_ui_text_secondary);
                    vKImageView.setEmptyImagePlaceholder(hnyVar);
                    vKImageView.setBackgroundImage(null);
                    return;
                }
                break;
            case -1409097913:
                if (str.equals("artist")) {
                    vKImageView.setEmptyImagePlaceholder(E(R.drawable.vk_icon_music_mic_24, vKImageView.getContext()));
                    vKImageView.setBackgroundImage(null);
                    return;
                }
                break;
            case -309425751:
                if (str.equals(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)) {
                    vKImageView.setEmptyImagePlaceholder(E(R.drawable.vk_icon_user_24, vKImageView.getContext()));
                    vKImageView.setBackgroundImage(null);
                    return;
                }
                break;
            case 98629247:
                if (str.equals("group")) {
                    vKImageView.setEmptyImagePlaceholder(E(R.drawable.vk_icon_users_24, vKImageView.getContext()));
                    vKImageView.setBackgroundImage(null);
                    return;
                }
                break;
            case 951024294:
                if (str.equals("concert")) {
                    vKImageView.setEmptyImagePlaceholder(E(R.drawable.vk_icon_calendar_outline_28, vKImageView.getContext()));
                    vKImageView.setBackgroundImage(null);
                    return;
                }
                break;
        }
        vKImageView.setEmptyImagePlaceholder(E(R.drawable.user_placeholder, vKImageView.getContext()));
        vKImageView.setBackgroundImage(null);
    }

    public static final q630 s(q630 q630Var, yc8 yc8Var) {
        return q630Var.g(new zc8(yc8Var));
    }

    public static void u(LinkedList linkedList) {
        try {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((File) it.next()).delete();
            }
        } catch (Exception e2) {
            L l = L.a;
            l.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l, L.LogType.d, new Object[]{"ZeroPrefCleaner", "can't delete " + j5g.Q(linkedList) + ' ' + e2.getMessage()});
        }
    }

    public static Object v(nx2 nx2Var, w2w w2wVar, String str, int i) {
        ProfilesSimpleInfo profilesSimpleInfo = new ProfilesSimpleInfo();
        if ((i & 4) != 0) {
            str = null;
        }
        return dcq.b((dcq) bz2.c(nx2Var, str), w2wVar, profilesSimpleInfo, 4);
    }

    public static final ArrayList y() {
        ArrayList arrayList = new ArrayList(5);
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        arrayList.add(new ls60(new NewsfeedList(0, context.getString(R.string.feed_title_home)), R.drawable.vk_icon_newsfeed_outline_28));
        Context context2 = e43.a;
        if (context2 == null) {
            context2 = null;
        }
        arrayList.add(new ls60(new NewsfeedList(-2, context2.getString(R.string.friends)), R.drawable.vk_icon_users_outline_28));
        Context context3 = e43.a;
        arrayList.add(new ls60(new NewsfeedList(-4, (context3 != null ? context3 : null).getString(R.string.feed_title_photo)), R.drawable.vk_icon_picture_outline_28));
        return arrayList;
    }

    public ArrayList H(com.vk.im.engine.models.c cVar, DialogExt dialogExt, Peer peer) {
        return w8m.b(cVar, dialogExt, peer);
    }

    public void I() {
        ClipsDraftPersistentStore.b.getClass();
        ClipsDraftPersistentStore.p(true);
        ClipsDraftPersistentStore.s();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) throws Throwable {
        return ((io.reactivex.rxjava3.core.q) obj).L(new f370(3), false);
    }

    @Override // xsna.x3z
    public void i(@NonNull c5z c5zVar) {
        c5zVar.onStart();
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i = upg0.h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? Tasks.forResult(bundle) : Tasks.forResult(null);
    }

    @Override // xsna.o2u0
    public void F2(String str) {
    }

    @Override // xsna.o2u0
    public void a(io.reactivex.rxjava3.disposables.c cVar) {
    }

    @Override // xsna.x3z
    public void j(@NonNull c5z c5zVar) {
    }

    @Override // xsna.mba
    public void z(int i, UIBlock uIBlock) {
    }

    @Override // xsna.o2u0
    public void fg(NewsEntry newsEntry, NewsEntry newsEntry2, int i) {
    }

    @Override // xsna.mba
    public void m(int i, UIBlock uIBlock, izs izsVar) {
    }

    @Override // xsna.mba
    public void q(int i, UIBlock uIBlock, Object obj) {
    }
}
