package xsna;

import java.util.LinkedHashMap;

/* compiled from: PushAnalyticsAggregate.kt */
/* loaded from: classes5.dex */
public final class xge0 {
    public final LinkedHashMap a = new LinkedHashMap();

    /* compiled from: PushAnalyticsAggregate.kt */
    public static final class a {
        public boolean a;
        public int b;
        public int c;
        public boolean d;
        public boolean e;

        public a() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + qoy.b(shy.a(this.c, shy.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChainState(serviceConnected=");
            sb.append(this.a);
            sb.append(", messageReceivedCount=");
            sb.append(this.b);
            sb.append(", deliveredCount=");
            sb.append(this.c);
            sb.append(", newToken=");
            sb.append(this.d);
            sb.append(", deleted=");
            return defpackage.q0.a(sb, this.e, ')');
        }

        public a(int i) {
            this.a = false;
            this.b = 0;
            this.c = 0;
            this.d = false;
            this.e = false;
        }
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
    public final void a(String str, String str2) {
        LinkedHashMap linkedHashMap = this.a;
        Object obj = linkedHashMap.get(str);
        if (obj == null) {
            obj = new a(0);
            linkedHashMap.put(str, obj);
        }
        a aVar = (a) obj;
        switch (str2.hashCode()) {
            case -1800840166:
                if (str2.equals("push_service_connected")) {
                    aVar.a = true;
                    break;
                }
                break;
            case -1703237634:
                if (str2.equals("push_on_deleted")) {
                    aVar.e = true;
                    break;
                }
                break;
            case -322363073:
                if (str2.equals("push_on_new_token")) {
                    aVar.d = true;
                    break;
                }
                break;
            case 1567584671:
                if (str2.equals("push_delivered")) {
                    aVar.c++;
                    break;
                }
                break;
            case 1608502484:
                if (str2.equals("push_on_message_received")) {
                    aVar.b++;
                    break;
                }
                break;
        }
    }
}
