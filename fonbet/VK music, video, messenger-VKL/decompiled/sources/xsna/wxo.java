package xsna;

import com.vk.stat.sak.scheme.SchemeStatSak$EcosystemNavigationItem;
import com.vk.stat.sak.scheme.SchemeStatSak$EcosystemNavigationOptionItem;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeVkidEcosystemNavigationItem;
import com.vk.superapp.multiaccount.api.SwitcherUiMode;
import com.vk.superapp.multiaccount.api.UserSecurityStatus;
import com.vk.superapp.multiaccount.api.a;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import xsna.asp;
import xsna.dyo;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: EcosystemProfileAnalyticsDelegate.kt */
/* loaded from: classes6.dex */
public final class wxo {
    public final com.vk.superapp.multiaccount.api.a a;
    public final vxo b;
    public final com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.c c;
    public final SwitcherUiMode d;
    public final Set<SchemeStatSak$TypeVkidEcosystemNavigationItem.Event> e = rl3.y0(new SchemeStatSak$TypeVkidEcosystemNavigationItem.Event[]{SchemeStatSak$TypeVkidEcosystemNavigationItem.Event.CLOSE, SchemeStatSak$TypeVkidEcosystemNavigationItem.Event.OPEN, SchemeStatSak$TypeVkidEcosystemNavigationItem.Event.SWITCH_ACCOUNT_TAP, SchemeStatSak$TypeVkidEcosystemNavigationItem.Event.MULTIACC_ADD_ANOTHER_ACCOUNT_TAP, SchemeStatSak$TypeVkidEcosystemNavigationItem.Event.MULTIACC_DROP_ACCOUNT_TAP, SchemeStatSak$TypeVkidEcosystemNavigationItem.Event.ERROR_API, SchemeStatSak$TypeVkidEcosystemNavigationItem.Event.ERROR_SWITCHER});
    public final bpn0 f = new bpn0(new k5h(this, 12));
    public dyo g = dyo.a.a;

    public wxo(com.vk.superapp.multiaccount.api.a aVar, vxo vxoVar, com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.c cVar, SwitcherUiMode switcherUiMode) {
        this.a = aVar;
        this.b = vxoVar;
        this.c = cVar;
        this.d = switcherUiMode;
    }

    public static void a(wxo wxoVar, SchemeStatSak$TypeVkidEcosystemNavigationItem.Event event, SchemeStatSak$EcosystemNavigationItem schemeStatSak$EcosystemNavigationItem, int i) {
        List list;
        a.c cVar = null;
        SchemeStatSak$EcosystemNavigationItem schemeStatSak$EcosystemNavigationItem2 = (i & 2) != 0 ? null : schemeStatSak$EcosystemNavigationItem;
        vxo vxoVar = wxoVar.b;
        if (wxoVar.d instanceof SwitcherUiMode.EcoplateRestricted) {
            return;
        }
        if ((wxoVar.c instanceof c.a) || !wxoVar.e.contains(event)) {
            com.vk.superapp.multiaccount.api.a aVar = wxoVar.a;
            SchemeStatSak$EventScreen schemeStatSak$EventScreen = (SchemeStatSak$EventScreen) wxoVar.f.getValue();
            dyo dyoVar = wxoVar.g;
            SwitcherUiMode switcherUiMode = vxoVar.b;
            com.vk.superapp.multiaccount.api.d dVar = vxoVar.a;
            com.vk.superapp.multiaccount.api.f fVar = (com.vk.superapp.multiaccount.api.f) j5g.a0(dVar.d());
            if (fVar == null) {
                list = EmptyList.b;
            } else {
                ArrayList arrayList = new ArrayList();
                UserSecurityStatus.a aVar2 = UserSecurityStatus.Companion;
                Integer num = fVar.a().j;
                aVar2.getClass();
                if (UserSecurityStatus.a.a(num) != UserSecurityStatus.SECURITY_PROTECTED) {
                    final SchemeStatSak$EcosystemNavigationItem schemeStatSak$EcosystemNavigationItem3 = SchemeStatSak$EcosystemNavigationItem.AVATAR;
                    final SchemeStatSak$EcosystemNavigationOptionItem.Values values = SchemeStatSak$EcosystemNavigationOptionItem.Values.ECOSYSTEM;
                    arrayList.add(new Object(schemeStatSak$EcosystemNavigationItem3, values) { // from class: com.vk.stat.sak.scheme.SchemeStatSak$EcosystemNavigationOptionItem

                        @pmi0("names")
                        private final SchemeStatSak$EcosystemNavigationItem names;

                        @pmi0("values")
                        private final Values values;

                        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                        /* compiled from: SchemeStatSak.kt */
                        public static final class Values {
                            private static final /* synthetic */ zrp $ENTRIES;
                            private static final /* synthetic */ Values[] $VALUES;

                            @pmi0("ecosystem")
                            public static final Values ECOSYSTEM;

                            @pmi0("multiaccount")
                            public static final Values MULTIACCOUNT;

                            @pmi0("service")
                            public static final Values SERVICE;

                            @pmi0("vk")
                            public static final Values VK;

                            static {
                                Values values = new Values("ECOSYSTEM", 0);
                                ECOSYSTEM = values;
                                Values values2 = new Values("VK", 1);
                                VK = values2;
                                Values values3 = new Values("SERVICE", 2);
                                SERVICE = values3;
                                Values values4 = new Values("MULTIACCOUNT", 3);
                                MULTIACCOUNT = values4;
                                Values[] valuesArr = {values, values2, values3, values4};
                                $VALUES = valuesArr;
                                $ENTRIES = new asp(valuesArr);
                            }

                            private Values(String str, int i) {
                            }

                            public static Values valueOf(String str) {
                                return (Values) Enum.valueOf(Values.class, str);
                            }

                            public static Values[] values() {
                                return (Values[]) $VALUES.clone();
                            }
                        }

                        {
                            this.names = schemeStatSak$EcosystemNavigationItem3;
                            this.values = values;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof SchemeStatSak$EcosystemNavigationOptionItem)) {
                                return false;
                            }
                            SchemeStatSak$EcosystemNavigationOptionItem schemeStatSak$EcosystemNavigationOptionItem = (SchemeStatSak$EcosystemNavigationOptionItem) obj;
                            return this.names == schemeStatSak$EcosystemNavigationOptionItem.names && this.values == schemeStatSak$EcosystemNavigationOptionItem.values;
                        }

                        public final int hashCode() {
                            return this.values.hashCode() + (this.names.hashCode() * 31);
                        }

                        public final String toString() {
                            return "EcosystemNavigationOptionItem(names=" + this.names + ", values=" + this.values + ')';
                        }
                    });
                }
                if (!(dyoVar instanceof g70)) {
                    final SchemeStatSak$EcosystemNavigationItem schemeStatSak$EcosystemNavigationItem4 = SchemeStatSak$EcosystemNavigationItem.VKID_LK;
                    final SchemeStatSak$EcosystemNavigationOptionItem.Values values2 = SchemeStatSak$EcosystemNavigationOptionItem.Values.ECOSYSTEM;
                    arrayList.add(new Object(schemeStatSak$EcosystemNavigationItem4, values2) { // from class: com.vk.stat.sak.scheme.SchemeStatSak$EcosystemNavigationOptionItem

                        @pmi0("names")
                        private final SchemeStatSak$EcosystemNavigationItem names;

                        @pmi0("values")
                        private final Values values;

                        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                        /* compiled from: SchemeStatSak.kt */
                        public static final class Values {
                            private static final /* synthetic */ zrp $ENTRIES;
                            private static final /* synthetic */ Values[] $VALUES;

                            @pmi0("ecosystem")
                            public static final Values ECOSYSTEM;

                            @pmi0("multiaccount")
                            public static final Values MULTIACCOUNT;

                            @pmi0("service")
                            public static final Values SERVICE;

                            @pmi0("vk")
                            public static final Values VK;

                            static {
                                Values values = new Values("ECOSYSTEM", 0);
                                ECOSYSTEM = values;
                                Values values2 = new Values("VK", 1);
                                VK = values2;
                                Values values3 = new Values("SERVICE", 2);
                                SERVICE = values3;
                                Values values4 = new Values("MULTIACCOUNT", 3);
                                MULTIACCOUNT = values4;
                                Values[] valuesArr = {values, values2, values3, values4};
                                $VALUES = valuesArr;
                                $ENTRIES = new asp(valuesArr);
                            }

                            private Values(String str, int i) {
                            }

                            public static Values valueOf(String str) {
                                return (Values) Enum.valueOf(Values.class, str);
                            }

                            public static Values[] values() {
                                return (Values[]) $VALUES.clone();
                            }
                        }

                        {
                            this.names = schemeStatSak$EcosystemNavigationItem4;
                            this.values = values2;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof SchemeStatSak$EcosystemNavigationOptionItem)) {
                                return false;
                            }
                            SchemeStatSak$EcosystemNavigationOptionItem schemeStatSak$EcosystemNavigationOptionItem = (SchemeStatSak$EcosystemNavigationOptionItem) obj;
                            return this.names == schemeStatSak$EcosystemNavigationOptionItem.names && this.values == schemeStatSak$EcosystemNavigationOptionItem.values;
                        }

                        public final int hashCode() {
                            return this.values.hashCode() + (this.names.hashCode() * 31);
                        }

                        public final String toString() {
                            return "EcosystemNavigationOptionItem(names=" + this.names + ", values=" + this.values + ')';
                        }
                    });
                }
                if (switcherUiMode != null) {
                    final SchemeStatSak$EcosystemNavigationItem schemeStatSak$EcosystemNavigationItem5 = SchemeStatSak$EcosystemNavigationItem.SWITCHER;
                    final SchemeStatSak$EcosystemNavigationOptionItem.Values values3 = SchemeStatSak$EcosystemNavigationOptionItem.Values.MULTIACCOUNT;
                    arrayList.add(new Object(schemeStatSak$EcosystemNavigationItem5, values3) { // from class: com.vk.stat.sak.scheme.SchemeStatSak$EcosystemNavigationOptionItem

                        @pmi0("names")
                        private final SchemeStatSak$EcosystemNavigationItem names;

                        @pmi0("values")
                        private final Values values;

                        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                        /* compiled from: SchemeStatSak.kt */
                        public static final class Values {
                            private static final /* synthetic */ zrp $ENTRIES;
                            private static final /* synthetic */ Values[] $VALUES;

                            @pmi0("ecosystem")
                            public static final Values ECOSYSTEM;

                            @pmi0("multiaccount")
                            public static final Values MULTIACCOUNT;

                            @pmi0("service")
                            public static final Values SERVICE;

                            @pmi0("vk")
                            public static final Values VK;

                            static {
                                Values values = new Values("ECOSYSTEM", 0);
                                ECOSYSTEM = values;
                                Values values2 = new Values("VK", 1);
                                VK = values2;
                                Values values3 = new Values("SERVICE", 2);
                                SERVICE = values3;
                                Values values4 = new Values("MULTIACCOUNT", 3);
                                MULTIACCOUNT = values4;
                                Values[] valuesArr = {values, values2, values3, values4};
                                $VALUES = valuesArr;
                                $ENTRIES = new asp(valuesArr);
                            }

                            private Values(String str, int i) {
                            }

                            public static Values valueOf(String str) {
                                return (Values) Enum.valueOf(Values.class, str);
                            }

                            public static Values[] values() {
                                return (Values[]) $VALUES.clone();
                            }
                        }

                        {
                            this.names = schemeStatSak$EcosystemNavigationItem5;
                            this.values = values3;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof SchemeStatSak$EcosystemNavigationOptionItem)) {
                                return false;
                            }
                            SchemeStatSak$EcosystemNavigationOptionItem schemeStatSak$EcosystemNavigationOptionItem = (SchemeStatSak$EcosystemNavigationOptionItem) obj;
                            return this.names == schemeStatSak$EcosystemNavigationOptionItem.names && this.values == schemeStatSak$EcosystemNavigationOptionItem.values;
                        }

                        public final int hashCode() {
                            return this.values.hashCode() + (this.names.hashCode() * 31);
                        }

                        public final String toString() {
                            return "EcosystemNavigationOptionItem(names=" + this.names + ", values=" + this.values + ')';
                        }
                    });
                }
                boolean z = dyoVar instanceof dyo.a;
                final SchemeStatSak$EcosystemNavigationOptionItem.Values values4 = switcherUiMode instanceof SwitcherUiMode.EcoplateLK ? SchemeStatSak$EcosystemNavigationOptionItem.Values.ECOSYSTEM : ((switcherUiMode instanceof SwitcherUiMode.Ecoplate) || !z) ? SchemeStatSak$EcosystemNavigationOptionItem.Values.VK : SchemeStatSak$EcosystemNavigationOptionItem.Values.ECOSYSTEM;
                if (switcherUiMode != null || z) {
                    final SchemeStatSak$EcosystemNavigationItem schemeStatSak$EcosystemNavigationItem6 = SchemeStatSak$EcosystemNavigationItem.LOGOUT;
                    arrayList.add(new Object(schemeStatSak$EcosystemNavigationItem6, values4) { // from class: com.vk.stat.sak.scheme.SchemeStatSak$EcosystemNavigationOptionItem

                        @pmi0("names")
                        private final SchemeStatSak$EcosystemNavigationItem names;

                        @pmi0("values")
                        private final Values values;

                        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                        /* compiled from: SchemeStatSak.kt */
                        public static final class Values {
                            private static final /* synthetic */ zrp $ENTRIES;
                            private static final /* synthetic */ Values[] $VALUES;

                            @pmi0("ecosystem")
                            public static final Values ECOSYSTEM;

                            @pmi0("multiaccount")
                            public static final Values MULTIACCOUNT;

                            @pmi0("service")
                            public static final Values SERVICE;

                            @pmi0("vk")
                            public static final Values VK;

                            static {
                                Values values = new Values("ECOSYSTEM", 0);
                                ECOSYSTEM = values;
                                Values values2 = new Values("VK", 1);
                                VK = values2;
                                Values values3 = new Values("SERVICE", 2);
                                SERVICE = values3;
                                Values values4 = new Values("MULTIACCOUNT", 3);
                                MULTIACCOUNT = values4;
                                Values[] valuesArr = {values, values2, values3, values4};
                                $VALUES = valuesArr;
                                $ENTRIES = new asp(valuesArr);
                            }

                            private Values(String str, int i) {
                            }

                            public static Values valueOf(String str) {
                                return (Values) Enum.valueOf(Values.class, str);
                            }

                            public static Values[] values() {
                                return (Values[]) $VALUES.clone();
                            }
                        }

                        {
                            this.names = schemeStatSak$EcosystemNavigationItem6;
                            this.values = values4;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof SchemeStatSak$EcosystemNavigationOptionItem)) {
                                return false;
                            }
                            SchemeStatSak$EcosystemNavigationOptionItem schemeStatSak$EcosystemNavigationOptionItem = (SchemeStatSak$EcosystemNavigationOptionItem) obj;
                            return this.names == schemeStatSak$EcosystemNavigationOptionItem.names && this.values == schemeStatSak$EcosystemNavigationOptionItem.values;
                        }

                        public final int hashCode() {
                            return this.values.hashCode() + (this.names.hashCode() * 31);
                        }

                        public final String toString() {
                            return "EcosystemNavigationOptionItem(names=" + this.names + ", values=" + this.values + ')';
                        }
                    });
                }
                list = arrayList;
            }
            com.vk.superapp.multiaccount.api.f fVar2 = (com.vk.superapp.multiaccount.api.f) j5g.a0(dVar.d());
            if (fVar2 != null) {
                UserSecurityStatus.a aVar3 = UserSecurityStatus.Companion;
                Integer num2 = fVar2.a().j;
                aVar3.getClass();
                UserSecurityStatus a = UserSecurityStatus.a.a(num2);
                Boolean bool = fVar2.a().k;
                int i2 = 1;
                int i3 = (bool == null || !bool.booleanValue()) ? 0 : 1;
                Boolean bool2 = fVar2.a().h;
                Boolean bool3 = Boolean.TRUE;
                if (!epx.f(bool2, bool3) && !epx.f(fVar2.a().i, bool3)) {
                    i2 = 0;
                }
                cVar = new a.c(a, i3, i2);
            }
            aVar.c(new a.e(event, schemeStatSak$EventScreen, list, schemeStatSak$EcosystemNavigationItem2, cVar));
        }
    }
}
