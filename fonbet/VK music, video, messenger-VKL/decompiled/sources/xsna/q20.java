package xsna;

import com.ironsource.D1;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.stat.scheme.SchemeStat$EventItem;

/* compiled from: ActionLinkToEventTypeMapper.kt */
/* loaded from: classes17.dex */
public final class q20 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static SchemeStat$EventItem.Type a(String str) {
        switch (str.hashCode()) {
            case -1820761141:
                if (str.equals(D1.e)) {
                    return SchemeStat$EventItem.Type.EXTERNAL;
                }
                break;
            case -933240040:
                if (str.equals("clips_compilation_first")) {
                    return SchemeStat$EventItem.Type.CLIPS_COMPILATION_FIRST;
                }
                break;
            case -732377866:
                if (str.equals("article")) {
                    return SchemeStat$EventItem.Type.ARTICLE;
                }
                break;
            case -652765742:
                if (str.equals("clips_user_link")) {
                    return SchemeStat$EventItem.Type.CLIPS_USER_LINK;
                }
                break;
            case -309474065:
                if (str.equals("product")) {
                    return SchemeStat$EventItem.Type.PRODUCT;
                }
                break;
            case -24297307:
                if (str.equals("clips_market_online_booking_link")) {
                    return SchemeStat$EventItem.Type.CLIPS_MARKET_ONLINE_BOOKING_LINK;
                }
                break;
            case 96801:
                if (str.equals(MBridgeConstans.DYNAMIC_VIEW_WX_APP)) {
                    return SchemeStat$EventItem.Type.APP;
                }
                break;
            case 3446719:
                if (str.equals("poll")) {
                    return SchemeStat$EventItem.Type.POLL;
                }
                break;
            case 3446944:
                if (str.equals("post")) {
                    return SchemeStat$EventItem.Type.POST;
                }
                break;
            case 3599307:
                if (str.equals("user")) {
                    return SchemeStat$EventItem.Type.USER;
                }
                break;
            case 98629247:
                if (str.equals("group")) {
                    return SchemeStat$EventItem.Type.GROUP;
                }
                break;
            case 112202875:
                if (str.equals("video")) {
                    return SchemeStat$EventItem.Type.VIDEO;
                }
                break;
            case 410578503:
                if (str.equals("clips_challenge")) {
                    return SchemeStat$EventItem.Type.CLIPS_CHALLENGE;
                }
                break;
            case 1217056139:
                if (str.equals("clips_compilation_next")) {
                    return SchemeStat$EventItem.Type.CLIPS_COMPILATION_NEXT;
                }
                break;
            case 1217297725:
                if (str.equals("clips_compilation_view")) {
                    return SchemeStat$EventItem.Type.CLIPS_COMPILATION_VIEW;
                }
                break;
        }
        return SchemeStat$EventItem.Type.LINK;
    }
}
