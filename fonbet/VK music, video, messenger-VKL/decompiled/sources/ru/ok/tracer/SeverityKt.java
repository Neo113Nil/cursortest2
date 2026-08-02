package ru.ok.tracer;

import ru.ok.tracer.Severity;

/* compiled from: Severity.kt */
/* loaded from: classes9.dex */
public final class SeverityKt {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static final Severity fromApiString(Severity.Companion companion, String str) {
        switch (str.hashCode()) {
            case -1986360616:
                if (str.equals("NOTICE")) {
                    return Severity.NOTICE;
                }
                break;
            case 2251950:
                if (str.equals("INFO")) {
                    return Severity.INFO;
                }
                break;
            case 64921139:
                if (str.equals("DEBUG")) {
                    return Severity.DEBUG;
                }
                break;
            case 66247144:
                if (str.equals("ERROR")) {
                    return Severity.ERROR;
                }
                break;
            case 66665700:
                if (str.equals("FATAL")) {
                    return Severity.FATAL;
                }
                break;
            case 1842428796:
                if (str.equals("WARNING")) {
                    return Severity.WARNING;
                }
                break;
        }
        return Severity.DEBUG;
    }

    public static final String toApiString(Severity severity) {
        if (severity.equals(Severity.FATAL)) {
            return "FATAL";
        }
        if (severity.equals(Severity.ERROR)) {
            return "ERROR";
        }
        if (severity.equals(Severity.WARNING)) {
            return "WARNING";
        }
        if (severity.equals(Severity.NOTICE)) {
            return "NOTICE";
        }
        if (severity.equals(Severity.INFO)) {
            return "INFO";
        }
        Severity.Companion companion = Severity.Companion;
        return "DEBUG";
    }
}
