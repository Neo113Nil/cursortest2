package com.yandex.go.inapp_calls.experiment;

import defpackage.c6z;
import defpackage.d6z;
import defpackage.gsq0;
import defpackage.i2v;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.syu;
import defpackage.w96;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/go/inapp_calls/experiment/InAppCallExperiment;", "Lw96;", "Lc6z;", "Companion", "Accessibility", "CallButton", "PermissionsDialog", "FullScreenRequestModal", "LoaderConfig", "NotificationChannelModel", "UpdateNotificationConfig", "RememberMyChoice", "IncomingCallFailedConfig", "com/yandex/go/inapp_calls/experiment/c", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InAppCallExperiment extends w96 implements c6z {
    public static final c Companion = new c();
    public static final i3y[] q;
    public static final InAppCallExperiment r;
    public final boolean b;
    public final Map c;
    public final String d;
    public final String e;
    public final Accessibility f;
    public final CallButton g;
    public final CallButton h;
    public final List i;
    public final PermissionsDialog j;
    public final FullScreenRequestModal k;
    public final LoaderConfig l;
    public final UpdateNotificationConfig m;
    public final IncomingCallFailedConfig n;
    public final RememberMyChoice o;
    public final NotificationChannelModel p;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        q = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new i2v(5)), null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new i2v(6)), null, null, null, null, null, null, null};
        r = new InAppCallExperiment(0);
    }

    public /* synthetic */ InAppCallExperiment(int i, boolean z, Map map, String str, String str2, Accessibility accessibility, CallButton callButton, CallButton callButton2, List list, PermissionsDialog permissionsDialog, FullScreenRequestModal fullScreenRequestModal, LoaderConfig loaderConfig, UpdateNotificationConfig updateNotificationConfig, IncomingCallFailedConfig incomingCallFailedConfig, RememberMyChoice rememberMyChoice, NotificationChannelModel notificationChannelModel) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
        if ((i & 8) == 0) {
            this.e = "";
        } else {
            this.e = str2;
        }
        if ((i & 16) == 0) {
            this.f = new Accessibility(0);
        } else {
            this.f = accessibility;
        }
        if ((i & 32) == 0) {
            this.g = new CallButton(0);
        } else {
            this.g = callButton;
        }
        if ((i & 64) == 0) {
            this.h = new CallButton(0);
        } else {
            this.h = callButton2;
        }
        if ((i & 128) == 0) {
            this.i = EmptyList.a;
        } else {
            this.i = list;
        }
        if ((i & 256) == 0) {
            this.j = new PermissionsDialog(0);
        } else {
            this.j = permissionsDialog;
        }
        if ((i & 512) == 0) {
            this.k = new FullScreenRequestModal(0);
        } else {
            this.k = fullScreenRequestModal;
        }
        if ((i & 1024) == 0) {
            this.l = new LoaderConfig(0);
        } else {
            this.l = loaderConfig;
        }
        if ((i & 2048) == 0) {
            this.m = null;
        } else {
            this.m = updateNotificationConfig;
        }
        if ((i & 4096) == 0) {
            this.n = null;
        } else {
            this.n = incomingCallFailedConfig;
        }
        if ((i & 8192) == 0) {
            this.o = null;
        } else {
            this.o = rememberMyChoice;
        }
        this.p = (i & 16384) == 0 ? new NotificationChannelModel(0) : notificationChannelModel;
    }

    public static String i(c6z c6zVar, String str) {
        if (str != null) {
            return d6z.Y(c6zVar, str);
        }
        return null;
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/inapp_calls/experiment/InAppCallExperiment$Accessibility;", "", "Companion", "$serializer", "com/yandex/go/inapp_calls/experiment/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Accessibility {
        public static final a Companion = new a();
        public final String a;

        public /* synthetic */ Accessibility(int i, String str) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
        }

        public Accessibility(int i) {
            this.a = "";
        }

        public Accessibility() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/inapp_calls/experiment/InAppCallExperiment$NotificationChannelModel;", "", "Companion", "$serializer", "com/yandex/go/inapp_calls/experiment/h", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class NotificationChannelModel {
        public static final h Companion = new h();
        public final String a;
        public final String b;

        public /* synthetic */ NotificationChannelModel(int i, String str, String str2) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
        }

        public NotificationChannelModel(int i) {
            this.a = "";
            this.b = null;
        }

        public NotificationChannelModel() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/inapp_calls/experiment/InAppCallExperiment$RememberMyChoice;", "", "Companion", "OrderCardItem", "SettingCardItem", "$serializer", "com/yandex/go/inapp_calls/experiment/j", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class RememberMyChoice {
        public static final j Companion = new j();
        public final OrderCardItem a;
        public final SettingCardItem b;

        public /* synthetic */ RememberMyChoice(int i, OrderCardItem orderCardItem, SettingCardItem settingCardItem) {
            this.a = (i & 1) == 0 ? new OrderCardItem(0) : orderCardItem;
            if ((i & 2) == 0) {
                this.b = new SettingCardItem(0);
            } else {
                this.b = settingCardItem;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/inapp_calls/experiment/InAppCallExperiment$RememberMyChoice$OrderCardItem;", "", "Companion", "$serializer", "com/yandex/go/inapp_calls/experiment/k", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        /* loaded from: classes12.dex */
        public static final class OrderCardItem {
            public static final k Companion = new k();
            public final String a;
            public final String b;

            public /* synthetic */ OrderCardItem(int i, String str, String str2) {
                if ((i & 1) == 0) {
                    this.a = "";
                } else {
                    this.a = str;
                }
                if ((i & 2) == 0) {
                    this.b = "";
                } else {
                    this.b = str2;
                }
            }

            public OrderCardItem(int i) {
                this.a = "";
                this.b = "";
            }

            public OrderCardItem() {
                this(0);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/inapp_calls/experiment/InAppCallExperiment$RememberMyChoice$SettingCardItem;", "", "Companion", "$serializer", "com/yandex/go/inapp_calls/experiment/l", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        /* loaded from: classes12.dex */
        public static final class SettingCardItem {
            public static final l Companion = new l();
            public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new syu(21))};
            public final String a;
            public final Map b;

            public /* synthetic */ SettingCardItem(int i, String str, Map map) {
                this.a = (i & 1) == 0 ? "" : str;
                if ((i & 2) == 0) {
                    this.b = kotlin.collections.b.f();
                } else {
                    this.b = map;
                }
            }

            /* renamed from: a, reason: from getter */
            public final String getA() {
                return this.a;
            }

            /* renamed from: b, reason: from getter */
            public final Map getB() {
                return this.b;
            }

            public SettingCardItem() {
                this(0);
            }

            public SettingCardItem(int i) {
                Map f = kotlin.collections.b.f();
                this.a = "";
                this.b = f;
            }
        }

        public RememberMyChoice() {
            OrderCardItem orderCardItem = new OrderCardItem(0);
            SettingCardItem settingCardItem = new SettingCardItem(0);
            this.a = orderCardItem;
            this.b = settingCardItem;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/inapp_calls/experiment/InAppCallExperiment$IncomingCallFailedConfig;", "", "Companion", "$serializer", "com/yandex/go/inapp_calls/experiment/f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class IncomingCallFailedConfig {
        public static final f Companion = new f();
        public final String a;
        public final String b;

        public /* synthetic */ IncomingCallFailedConfig(int i, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
        }

        public IncomingCallFailedConfig() {
            this.a = "";
            this.b = "";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/inapp_calls/experiment/InAppCallExperiment$UpdateNotificationConfig;", "", "Companion", "$serializer", "com/yandex/go/inapp_calls/experiment/m", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class UpdateNotificationConfig {
        public static final m Companion = new m();
        public final String a;
        public final String b;
        public final String c;

        public /* synthetic */ UpdateNotificationConfig(int i, String str, String str2, String str3) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str3;
            }
        }

        public UpdateNotificationConfig() {
            this.a = "";
            this.b = "";
            this.c = "";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/inapp_calls/experiment/InAppCallExperiment$CallButton;", "", "Companion", "$serializer", "com/yandex/go/inapp_calls/experiment/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class CallButton {
        public static final b Companion = new b();
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public /* synthetic */ CallButton(int i, String str, String str2, String str3, String str4) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str4;
            }
        }

        public CallButton(int i) {
            this.a = "";
            this.b = null;
            this.c = null;
            this.d = null;
        }

        public CallButton() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/inapp_calls/experiment/InAppCallExperiment$LoaderConfig;", "", "Companion", "$serializer", "com/yandex/go/inapp_calls/experiment/g", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class LoaderConfig {
        public static final g Companion = new g();
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        public /* synthetic */ LoaderConfig(String str, String str2, String str3, String str4, int i, String str5) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str4;
            }
            if ((i & 16) == 0) {
                this.e = "";
            } else {
                this.e = str5;
            }
        }

        public LoaderConfig(int i) {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = "";
            this.e = "";
        }

        public LoaderConfig() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/inapp_calls/experiment/InAppCallExperiment$PermissionsDialog;", "", "Companion", "$serializer", "com/yandex/go/inapp_calls/experiment/i", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class PermissionsDialog {
        public static final i Companion = new i();
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        public /* synthetic */ PermissionsDialog(String str, String str2, String str3, String str4, int i, String str5) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str4;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = str5;
            }
        }

        public PermissionsDialog(int i) {
            this.a = "";
            this.b = null;
            this.c = "";
            this.d = "";
            this.e = null;
        }

        public PermissionsDialog() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/inapp_calls/experiment/InAppCallExperiment$FullScreenRequestModal;", "", "Companion", "ShowMode", "$serializer", "com/yandex/go/inapp_calls/experiment/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class FullScreenRequestModal {
        public static final d Companion = new d();
        public static final i3y[] g;
        public final String a;
        public final String b;
        public final String c;
        public final List d;
        public final ShowMode e;
        public final String f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/inapp_calls/experiment/InAppCallExperiment$FullScreenRequestModal$ShowMode;", "", "Companion", "com/yandex/go/inapp_calls/experiment/e", "ONCE", "FORCE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class ShowMode {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ ShowMode[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final e Companion;
            public static final ShowMode FORCE;
            public static final ShowMode ONCE;

            static {
                ShowMode showMode = new ShowMode("ONCE", 0);
                ONCE = showMode;
                ShowMode showMode2 = new ShowMode("FORCE", 1);
                FORCE = showMode2;
                ShowMode[] showModeArr = {showMode, showMode2};
                $VALUES = showModeArr;
                $ENTRIES = kotlin.enums.a.a(showModeArr);
                Companion = new e();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new syu(20));
            }

            public static ShowMode valueOf(String str) {
                return (ShowMode) Enum.valueOf(ShowMode.class, str);
            }

            public static ShowMode[] values() {
                return (ShowMode[]) $VALUES.clone();
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            g = new i3y[]{null, null, null, kotlin.a.b(lazyThreadSafetyMode, new i2v(7)), kotlin.a.b(lazyThreadSafetyMode, new i2v(8)), null};
        }

        public /* synthetic */ FullScreenRequestModal(int i, String str, String str2, String str3, List list, ShowMode showMode, String str4) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = EmptyList.a;
            } else {
                this.d = list;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = showMode;
            }
            if ((i & 32) == 0) {
                this.f = "";
            } else {
                this.f = str4;
            }
        }

        public FullScreenRequestModal(int i) {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = EmptyList.a;
            this.e = null;
            this.f = "";
        }

        public FullScreenRequestModal() {
            this(0);
        }
    }

    public InAppCallExperiment() {
        this(0);
    }

    public InAppCallExperiment(int i) {
        Map f = kotlin.collections.b.f();
        Accessibility accessibility = new Accessibility(0);
        CallButton callButton = new CallButton(0);
        CallButton callButton2 = new CallButton(0);
        PermissionsDialog permissionsDialog = new PermissionsDialog(0);
        FullScreenRequestModal fullScreenRequestModal = new FullScreenRequestModal(0);
        LoaderConfig loaderConfig = new LoaderConfig(0);
        NotificationChannelModel notificationChannelModel = new NotificationChannelModel(0);
        this.b = false;
        this.c = f;
        this.d = "";
        this.e = "";
        this.f = accessibility;
        this.g = callButton;
        this.h = callButton2;
        this.i = EmptyList.a;
        this.j = permissionsDialog;
        this.k = fullScreenRequestModal;
        this.l = loaderConfig;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = notificationChannelModel;
    }
}
