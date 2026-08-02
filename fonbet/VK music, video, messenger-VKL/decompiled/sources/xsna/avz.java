package xsna;

import com.vk.im.engine.config.PushInfoBarScheduleRepeat;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: LocalInfoBarHelper.kt */
/* loaded from: classes2.dex */
public final class avz {

    /* compiled from: LocalInfoBarHelper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PushInfoBarScheduleRepeat.values().length];
            try {
                iArr[PushInfoBarScheduleRepeat.STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PushInfoBarScheduleRepeat.REPEAT_LAST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PushInfoBarScheduleRepeat.CYCLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        if (r12.equals("private_dialog_info_bar_msg_push_disabled") == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006d, code lost:
    
        if (c(r11, r12) <= 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0073, code lost:
    
        if (r12.equals("private_dialog_info_bar_msg_push_disabled") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
    
        return b(r11, r12, r11.getConfig().j0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0084, code lost:
    
        if (r12.equals("dialogs_list_info_bar_msg_push_disabled") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0090, code lost:
    
        return b(r11, r12, r11.getConfig().k0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0091, code lost:
    
        r0 = r12.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0098, code lost:
    
        if (r0 == (-1051177964)) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009d, code lost:
    
        if (r0 == (-290081817)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a2, code lost:
    
        if (r0 == 722597741) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a9, code lost:
    
        if (r12.equals("dialogs_list_info_bar_connect_edu_chats") != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ac, code lost:
    
        r0 = r11.getConfig().m0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cd, code lost:
    
        if (r0.isEmpty() == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d0, code lost:
    
        r1 = (int) c(r11, r12);
        r12 = r11.V0().a().h(e(r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e5, code lost:
    
        if (r12 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e7, code lost:
    
        r9 = r12.longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00eb, code lost:
    
        r11 = r11.f1();
        r1 = (java.lang.Integer) xsna.j5g.b0(r1 - 1, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f6, code lost:
    
        if (r1 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f8, code lost:
    
        r0 = r1.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0111, code lost:
    
        if (r11 < (java.util.concurrent.TimeUnit.DAYS.toMillis(r0) + r9)) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0114, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fd, code lost:
    
        r0 = ((java.lang.Number) xsna.j5g.i0(r0)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c0, code lost:
    
        r0 = kotlin.collections.EmptyList.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b7, code lost:
    
        if (r12.equals("voip_calls_import_contacts_banner") != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c3, code lost:
    
        r0 = r11.getConfig().l0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00be, code lost:
    
        if (r12.equals("dialogs_list_info_bar_sync_contacts_disabled") != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0041, code lost:
    
        if (r12.equals("dialogs_list_info_bar_connect_edu_chats") == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0049, code lost:
    
        if (r12.equals("dialogs_list_info_bar_msg_push_disabled") == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0051, code lost:
    
        if (r12.equals("voip_calls_import_contacts_banner") == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x005b, code lost:
    
        if (r12.equals("allow_incoming_call_push_setting_banner") == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0063, code lost:
    
        if (r12.equals("dialogs_list_info_bar_sync_contacts_disabled") != false) goto L30;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(w2w w2wVar, String str) {
        if (k9q0.p(w2wVar)) {
            return false;
        }
        switch (str.hashCode()) {
            case -1051177964:
                break;
            case -613772574:
                break;
            case -290081817:
                break;
            case 543775731:
                break;
            case 722597741:
                break;
            case 854805857:
                break;
            case 1872639947:
                if (str.equals("edu_switch_account")) {
                    return w2wVar.V0().a().getBoolean("private_dialog_banner_edu_enabled", true);
                }
                return true;
            default:
                return true;
        }
    }

    public static boolean b(w2w w2wVar, String str, bje0 bje0Var) {
        List<Integer> list = bje0Var.a;
        if (list.isEmpty()) {
            return false;
        }
        int c = (int) c(w2wVar, str);
        int i = a.$EnumSwitchMapping$0[bje0Var.b.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                c %= list.size();
            } else if (c >= list.size()) {
                c = e43.h(list);
            }
        } else if (c < 0 || c >= list.size()) {
            return false;
        }
        int intValue = list.get(c).intValue();
        Long h = w2wVar.V0().a().h(e(str));
        return w2wVar.f1() >= TimeUnit.DAYS.toMillis((long) intValue) + (h != null ? h.longValue() : 0L);
    }

    public static long c(w2w w2wVar, String str) {
        Long h = w2wVar.V0().a().h(d(str));
        if (h != null) {
            return h.longValue();
        }
        return 0L;
    }

    public static String d(String str) {
        switch (str.hashCode()) {
            case -1051177964:
                return !str.equals("dialogs_list_info_bar_sync_contacts_disabled") ? "" : "dialogs_list_sync_contacts_info_bar_hide_cnt";
            case -290081817:
                return !str.equals("voip_calls_import_contacts_banner") ? "" : "voip_calls_import_sync_contacts_banner_hide_cnt";
            case 543775731:
                return !str.equals("dialogs_list_info_bar_msg_push_disabled") ? "" : "dialogs_list_push_info_bar_hide_cnt";
            case 722597741:
                return !str.equals("dialogs_list_info_bar_connect_edu_chats") ? "" : "dialogs_list_connect_edu_chats_info_bar_hide_cnt";
            case 854805857:
                return !str.equals("private_dialog_info_bar_msg_push_disabled") ? "" : "private_dialog_push_info_bar_hide_cnt";
            default:
                return "";
        }
    }

    public static String e(String str) {
        switch (str.hashCode()) {
            case -1051177964:
                return !str.equals("dialogs_list_info_bar_sync_contacts_disabled") ? "" : "dialogs_list_sync_contacts_info_bar_hide_time_ms";
            case -290081817:
                return !str.equals("voip_calls_import_contacts_banner") ? "" : "voip_calls_import_sync_contacts_banner_hide_time_ms";
            case 543775731:
                return !str.equals("dialogs_list_info_bar_msg_push_disabled") ? "" : "dialogs_list_push_info_bar_hide_time_ms";
            case 722597741:
                return !str.equals("dialogs_list_info_bar_connect_edu_chats") ? "" : "dialogs_list_connect_edu_chats_info_bar_hide_time_ms";
            case 854805857:
                return !str.equals("private_dialog_info_bar_msg_push_disabled") ? "" : "private_dialog_push_info_bar_hide_time_ms";
            default:
                return "";
        }
    }

    public static void f(w2w w2wVar, String str) {
        w2wVar.V0().a().j(d(str), 0L);
        w2wVar.V0().a().j(e(str), 0L);
    }

    public static void g(long j, String str, w2w w2wVar) {
        w2wVar.V0().a().j(d(str), c(w2wVar, str) + 1);
        w2wVar.V0().a().j(e(str), j);
    }
}
