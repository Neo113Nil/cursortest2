package xsna;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.ui.bridges.MaxButtonVariants;
import com.vk.im.ui.di.MaxUtilityComponent;
import com.vk.im.ui.max.MaxRedirectHandler;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.voip.ui.call_options.source.list.ItemsFactory$Event;
import com.vk.voip.ui.di.VoipAnalyticsInternalComponent;
import com.vk.voip.ui.prodstat.analytics.max.view.VoipMaxAppViewAnalytics;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.dw20;
import xsna.htw0;

/* compiled from: CallOptions.kt */
/* loaded from: classes7.dex */
public final class x69 {

    /* compiled from: CallOptions.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ItemsFactory$Event.values().length];
            try {
                iArr[ItemsFactory$Event.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ItemsFactory$Event.AUDIO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ItemsFactory$Event.MAX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MaxButtonVariants.values().length];
            try {
                iArr2[MaxButtonVariants.ForInstalledOnly.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[MaxButtonVariants.ForAnyone.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[MaxButtonVariants.NoOne.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[MobileOfficialAppsCoreNavStat$EventScreen.values().length];
            try {
                iArr3[MobileOfficialAppsCoreNavStat$EventScreen.FRIENDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[MobileOfficialAppsCoreNavStat$EventScreen.FRIENDS_ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[MobileOfficialAppsCoreNavStat$EventScreen.FRIENDS_ONLINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[MobileOfficialAppsCoreNavStat$EventScreen.FRIENDS_MUTUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[MobileOfficialAppsCoreNavStat$EventScreen.PROFILE_ALL_FOLLOWERS.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [T, xsna.dw20] */
    public static final void a(Context context, wzs wzsVar) {
        int i = ukq.F;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ukq ukqVar = new ukq(context, new tkq(ref$ObjectRef, 0), wzsVar, new xyh(ref$ObjectRef, 10));
        ukqVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        ref$ObjectRef.element = new dw20.b(context, null).c(new d5j(ukqVar)).F0(true).x(0).u(0).O().B(cn70.b(12), true, true).D0(ukqVar, false).a0(new d2(context)).I0("BOTTOM_SELECT");
    }

    public static /* synthetic */ void b(Context context, wzs wzsVar) {
        context.getString(R.string.voip_call_from);
        context.getString(R.string.vkim_msg_header_menu_call_with_video);
        a(context, wzsVar);
    }

    public static final void c(Context context, UserProfile userProfile, VoipCallSource voipCallSource, MaxButtonVariants maxButtonVariants) {
        e(context, Peer.Type.USER, voipCallSource, maxButtonVariants, new bo3(userProfile, 3));
    }

    public static final void d(Context context, qtd0 qtd0Var, VoipCallSource voipCallSource, MaxButtonVariants maxButtonVariants) {
        if (qtd0Var instanceof Contact) {
            e(context, Peer.Type.CONTACT, voipCallSource, maxButtonVariants, new zg7(qtd0Var, 1));
        } else {
            e(context, qtd0Var.t8(), voipCallSource, maxButtonVariants, new w69(qtd0Var, 0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, xsna.dw20] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(Context context, Peer.Type type, VoipCallSource voipCallSource, MaxButtonVariants maxButtonVariants, wzs<? super UserId, ? super Boolean, zqk0> wzsVar) {
        boolean b;
        MobileOfficialAppsCallsStat$TypeVoipCallItem.Source source;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = voipCallSource.c;
        MobileOfficialAppsCallsStat$TypeVoipCallItem.Source source2 = voipCallSource.b;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen2 = MobileOfficialAppsCoreNavStat$EventScreen.PROFILE;
        mdw0 mdw0Var = (mobileOfficialAppsCoreNavStat$EventScreen == mobileOfficialAppsCoreNavStat$EventScreen2 && source2 == MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.PROFILE) ? htw0.b.InterfaceC3021b.a.a : (mobileOfficialAppsCoreNavStat$EventScreen == MobileOfficialAppsCoreNavStat$EventScreen.FRIENDS && source2 == MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.FRIENDS_LIST) ? htw0.b.a.C3020a.a : null;
        if (mdw0Var != null) {
            ((VoipAnalyticsInternalComponent) ((k7m) m7m.f(new a79())).mo408a(fpf0.a(VoipAnalyticsInternalComponent.class))).Df().b(mdw0Var);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        if (type == Peer.Type.USER || type == Peer.Type.CONTACT) {
            MaxRedirectHandler j7 = ((MaxUtilityComponent) ((k7m) m7m.f(new z69())).mo408a(fpf0.a(MaxUtilityComponent.class))).j7();
            int i = a.$EnumSwitchMapping$1[maxButtonVariants.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    b = true;
                    ListBuilder e = e43.e();
                    e.add(new d19(ItemsFactory$Event.AUDIO, R.drawable.vk_icon_phone_outline_28, R.string.vkim_msg_header_menu_call_with_audio));
                    e.add(new d19(ItemsFactory$Event.VIDEO, R.drawable.vk_icon_videocam_outline_28, R.string.vkim_msg_header_menu_call_with_video));
                    if (b) {
                        e.add(new d19(ItemsFactory$Event.MAX, R.drawable.vk_icon_logo_max_color_56, R.string.vkim_msg_header_menu_call_in_MAX));
                    }
                    ListBuilder g = e.g();
                    x37 x37Var = new x37(type, voipCallSource, wzsVar, maxButtonVariants, ref$ObjectRef);
                    r97 r97Var = new r97(context, ref$ObjectRef, wzsVar, voipCallSource, 1);
                    c19 c19Var = new c19();
                    c19Var.y0(new e19(x37Var));
                    c19Var.y0(new bc9(r97Var));
                    c19Var.setItems(g);
                    source = MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.FRIENDS_LIST;
                    if (source2 == source) {
                        int i2 = a.$EnumSwitchMapping$2[mobileOfficialAppsCoreNavStat$EventScreen.ordinal()];
                        if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
                            int i3 = y1z.a;
                            LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
                        } else if (i2 == 5) {
                            int i4 = y1z.a;
                            LegoCustomRedesignedScreen legoCustomRedesignedScreen2 = LegoCustomRedesignedScreen.EXAMPLE;
                        }
                    }
                    RecyclerView recyclerView = new RecyclerView(context);
                    recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    recyclerView.setLayoutManager(new LinearLayoutManager());
                    recyclerView.setAdapter(c19Var);
                    dw20.b D0 = new dw20.b(context, null).D0(recyclerView, false);
                    int b2 = cn70.b(16);
                    D0.getClass();
                    D0.d.q1 = b2;
                    D0.P0();
                    ref$ObjectRef.element = D0.I0("BOTTOM_DIALOG");
                    if (b) {
                        VoipMaxAppViewAnalytics.Event.ShowCallButton.Source source3 = (mobileOfficialAppsCoreNavStat$EventScreen == MobileOfficialAppsCoreNavStat$EventScreen.CALLS && source2 == MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.HISTORY_SERVICES) ? VoipMaxAppViewAnalytics.Event.ShowCallButton.Source.CALLS_SERVICES_OTHER : (mobileOfficialAppsCoreNavStat$EventScreen == MobileOfficialAppsCoreNavStat$EventScreen.FRIENDS && source2 == source) ? VoipMaxAppViewAnalytics.Event.ShowCallButton.Source.FRIENDS_LIST : (mobileOfficialAppsCoreNavStat$EventScreen == mobileOfficialAppsCoreNavStat$EventScreen2 && source2 == MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.PROFILE) ? VoipMaxAppViewAnalytics.Event.ShowCallButton.Source.PROFILE : (mobileOfficialAppsCoreNavStat$EventScreen == MobileOfficialAppsCoreNavStat$EventScreen.IM_CONVERSATION_DETAIL && source2 == MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.IM_HEADER) ? VoipMaxAppViewAnalytics.Event.ShowCallButton.Source.IM_PROFILE : null;
                        if (source3 != null) {
                            ((VoipAnalyticsInternalComponent) ((k7m) m7m.f(new a79())).mo408a(fpf0.a(VoipAnalyticsInternalComponent.class))).Df().b(new VoipMaxAppViewAnalytics.Event.ShowCallButton(gjw0.b(type), source3));
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (j7.c()) {
                b = j7.b();
                ListBuilder e2 = e43.e();
                e2.add(new d19(ItemsFactory$Event.AUDIO, R.drawable.vk_icon_phone_outline_28, R.string.vkim_msg_header_menu_call_with_audio));
                e2.add(new d19(ItemsFactory$Event.VIDEO, R.drawable.vk_icon_videocam_outline_28, R.string.vkim_msg_header_menu_call_with_video));
                if (b) {
                }
                ListBuilder g2 = e2.g();
                x37 x37Var2 = new x37(type, voipCallSource, wzsVar, maxButtonVariants, ref$ObjectRef);
                r97 r97Var2 = new r97(context, ref$ObjectRef, wzsVar, voipCallSource, 1);
                c19 c19Var2 = new c19();
                c19Var2.y0(new e19(x37Var2));
                c19Var2.y0(new bc9(r97Var2));
                c19Var2.setItems(g2);
                source = MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.FRIENDS_LIST;
                if (source2 == source) {
                }
                RecyclerView recyclerView2 = new RecyclerView(context);
                recyclerView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                recyclerView2.setLayoutManager(new LinearLayoutManager());
                recyclerView2.setAdapter(c19Var2);
                dw20.b D02 = new dw20.b(context, null).D0(recyclerView2, false);
                int b22 = cn70.b(16);
                D02.getClass();
                D02.d.q1 = b22;
                D02.P0();
                ref$ObjectRef.element = D02.I0("BOTTOM_DIALOG");
                if (b) {
                }
            }
        }
        b = false;
        ListBuilder e22 = e43.e();
        e22.add(new d19(ItemsFactory$Event.AUDIO, R.drawable.vk_icon_phone_outline_28, R.string.vkim_msg_header_menu_call_with_audio));
        e22.add(new d19(ItemsFactory$Event.VIDEO, R.drawable.vk_icon_videocam_outline_28, R.string.vkim_msg_header_menu_call_with_video));
        if (b) {
        }
        ListBuilder g22 = e22.g();
        x37 x37Var22 = new x37(type, voipCallSource, wzsVar, maxButtonVariants, ref$ObjectRef);
        r97 r97Var22 = new r97(context, ref$ObjectRef, wzsVar, voipCallSource, 1);
        c19 c19Var22 = new c19();
        c19Var22.y0(new e19(x37Var22));
        c19Var22.y0(new bc9(r97Var22));
        c19Var22.setItems(g22);
        source = MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.FRIENDS_LIST;
        if (source2 == source) {
        }
        RecyclerView recyclerView22 = new RecyclerView(context);
        recyclerView22.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        recyclerView22.setLayoutManager(new LinearLayoutManager());
        recyclerView22.setAdapter(c19Var22);
        dw20.b D022 = new dw20.b(context, null).D0(recyclerView22, false);
        int b222 = cn70.b(16);
        D022.getClass();
        D022.d.q1 = b222;
        D022.P0();
        ref$ObjectRef.element = D022.I0("BOTTOM_DIALOG");
        if (b) {
        }
    }
}
