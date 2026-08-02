package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.core.net.entities.ActivateChatRequestParams;
import com.yandex.messaging.core.net.entities.AddFilesParams;
import com.yandex.messaging.core.net.entities.AddFilesResponse;
import com.yandex.messaging.core.net.entities.BucketsData;
import com.yandex.messaging.core.net.entities.ChatData;
import com.yandex.messaging.core.net.entities.ChatSettingsParams;
import com.yandex.messaging.core.net.entities.ContactCheckHashParam;
import com.yandex.messaging.core.net.entities.ContactCheckHashResponse;
import com.yandex.messaging.core.net.entities.ContactData;
import com.yandex.messaging.core.net.entities.ContactsDownloadParam;
import com.yandex.messaging.core.net.entities.EmptyResponse;
import com.yandex.messaging.core.net.entities.FoldersBucket;
import com.yandex.messaging.core.net.entities.GetBucketsParams;
import com.yandex.messaging.core.net.entities.GetChatDataByInviteHashParams;
import com.yandex.messaging.core.net.entities.GetChatInfoByAlias;
import com.yandex.messaging.core.net.entities.GetChatInfoData;
import com.yandex.messaging.core.net.entities.GetChatInfoParam;
import com.yandex.messaging.core.net.entities.GetChatSettingsParams;
import com.yandex.messaging.core.net.entities.GetMediaMessagesParams;
import com.yandex.messaging.core.net.entities.GetStaffDataParam;
import com.yandex.messaging.core.net.entities.GetSuggestData;
import com.yandex.messaging.core.net.entities.GetSuggestParam;
import com.yandex.messaging.core.net.entities.GetUrlPreviewRequestParam;
import com.yandex.messaging.core.net.entities.GetUrlPreviewResponse;
import com.yandex.messaging.core.net.entities.GetUsersDataParam;
import com.yandex.messaging.core.net.entities.JoinParams;
import com.yandex.messaging.core.net.entities.JoinThreadData;
import com.yandex.messaging.core.net.entities.JoinThreadParams;
import com.yandex.messaging.core.net.entities.LeaveParams;
import com.yandex.messaging.core.net.entities.LeaveThreadParams;
import com.yandex.messaging.core.net.entities.MediaMessageListData;
import com.yandex.messaging.core.net.entities.PinnedChatsBucket;
import com.yandex.messaging.core.net.entities.RecommendedUser;
import com.yandex.messaging.core.net.entities.RecommendedUsersData;
import com.yandex.messaging.core.net.entities.RecommendedUsersParams;
import com.yandex.messaging.core.net.entities.ResolveInviteLinkTokenParams;
import com.yandex.messaging.core.net.entities.ResolveInviteLinkTokenResponse;
import com.yandex.messaging.core.net.entities.ResolveYaDiskParams;
import com.yandex.messaging.core.net.entities.ResolveYaDiskResponse;
import com.yandex.messaging.core.net.entities.ShareFileParams;
import com.yandex.messaging.core.net.entities.ShareFileResponse;
import com.yandex.messaging.core.net.entities.StaffUserDataData;
import com.yandex.messaging.core.net.entities.UserData;
import com.yandex.messaging.core.net.entities.UsersData;
import com.yandex.messaging.core.net.entities.YaDiskErrorInfo;
import com.yandex.messaging.core.net.entities.chatcreate.CreateGroupChatParam;
import com.yandex.messaging.core.net.entities.chatcreate.CreatePrivateChatData;
import com.yandex.messaging.core.net.entities.chatcreate.CreatePrivateChatParam;
import com.yandex.messaging.core.net.entities.chatcreate.GroupChatData;
import com.yandex.messaging.internal.entities.feedback.FeedbackReasonsData;
import com.yandex.messaging.internal.net.Error;
import io.appmetrica.analytics.AppMetricaYandex;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.ott.data.net.impl.ManifestApiImpl;

/* loaded from: classes15.dex */
public final class io3 extends w920 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ io3(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.w = obj2;
        this.c = obj3;
    }

    @Override // defpackage.w920
    public boolean c() {
        switch (this.a) {
            case 23:
                if (((to3) this.b).h.a(tz10.n)) {
                    return !false;
                }
                return false;
            default:
                return super.c();
        }
    }

    @Override // defpackage.w920
    public final gg70 d(kvj0 kvj0Var) {
        rvj0 rvj0Var;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ouu.b(((to3) obj2).b, "activate_chat", EmptyResponse.class, kvj0Var);
            case 1:
                return ouu.b(((to3) obj2).b, "add_files", AddFilesResponse.class, kvj0Var);
            case 2:
                return ouu.b(((to3) obj2).b, "contact_check_hash", ContactCheckHashResponse.class, kvj0Var);
            case 3:
                rvj0 rvj0Var2 = kvj0Var.z;
                if (rvj0Var2 != null) {
                    rvj0Var2.contentLength();
                }
                return ouu.b(((to3) obj2).b, "list_contacts", ContactData[].class, kvj0Var);
            case 4:
                return ouu.b(((to3) obj2).b, "create_private_chat", CreatePrivateChatData.class, kvj0Var);
            case 5:
                gg70 b = ouu.b(((to3) obj2).b, "get_buckets", BucketsData.class, kvj0Var);
                return b instanceof dg70 ? new dg70((BucketsData) ((dg70) b).a) : new gg70();
            case 6:
                return ouu.b(((to3) obj2).b, "get_chats_info", GetChatInfoData.class, kvj0Var);
            case 7:
                return ouu.b(((to3) obj2).b, "get_chats_info", GetChatInfoData.class, kvj0Var);
            case 8:
                return ouu.b(((to3) obj2).b, "get_chats_info", GetChatInfoData.class, kvj0Var);
            case 9:
                return ouu.b(((to3) obj2).b, "get_chat_settings", ChatSettingsParams.class, kvj0Var);
            case 10:
                return ouu.b(((to3) obj2).b, "get_chats_info", GetChatInfoData.class, kvj0Var);
            case 11:
                return ouu.b(((to3) obj2).b, "get_media_messages", MediaMessageListData.class, kvj0Var);
            case 12:
                return ouu.b(((to3) obj2).b, "get_chats_info", GetChatInfoData.class, kvj0Var);
            case 13:
                gg70 b2 = ouu.b(((to3) obj2).b, "get_recommended_users", RecommendedUsersData.class, kvj0Var);
                if (!(b2 instanceof dg70)) {
                    return b2;
                }
                RecommendedUser[] users = ((RecommendedUsersData) ((dg70) b2).a).getUsers();
                return (users == null || users.length < 3) ? gg70.b(500, "need more recommended users") : b2;
            case 14:
                gg70 b3 = ouu.b(((to3) obj2).b, "get_user_by_nickname", StaffUserDataData.class, kvj0Var);
                return b3 instanceof dg70 ? new dg70(((dg70) b3).a) : gg70.b(kvj0Var.w, kvj0Var.c);
            case 15:
                return ouu.b(((to3) obj2).b, "get_suggest", GetSuggestData.class, kvj0Var);
            case 16:
                return ouu.b(((to3) obj2).b, "get_url_preview", GetUrlPreviewResponse.class, kvj0Var);
            case 17:
                gg70 b4 = ouu.b(((to3) obj2).b, "get_users_data", UsersData.class, kvj0Var);
                if (b4 instanceof dg70) {
                    Object obj3 = ((dg70) b4).a;
                    if (((UsersData) obj3).users.length == 1) {
                        return new dg70(((UsersData) obj3).users[0]);
                    }
                }
                return gg70.b(kvj0Var.w, kvj0Var.c);
            case 18:
                return ouu.b(((to3) obj2).b, "get_users_data", UsersData.class, kvj0Var);
            case 19:
                return ouu.b(((to3) obj2).b, "leave", EmptyResponse.class, kvj0Var);
            case 20:
                return ouu.b(((to3) obj2).b, "leave_thread", JoinThreadData.class, kvj0Var);
            case 21:
                return ouu.b(((to3) obj2).b, "set_bucket", BucketsData.class, kvj0Var);
            case 22:
                return ouu.b(((to3) obj2).b, "resolve_token", ResolveInviteLinkTokenResponse.class, kvj0Var);
            case 23:
                return ouu.b(((to3) obj2).b, "upload_to_disk", ResolveYaDiskResponse.class, kvj0Var);
            case 24:
                return ouu.b(((to3) obj2).b, "share_file", ShareFileResponse.class, kvj0Var);
            case 25:
                return ouu.b(((to3) obj2).b, "set_bucket", BucketsData.class, kvj0Var);
            case 26:
                if (kvj0Var.J && (rvj0Var = kvj0Var.z) != null) {
                    try {
                        FeedbackReasonsData feedbackReasonsData = (FeedbackReasonsData) ((Moshi) ((w3i) obj2).y).adapter(FeedbackReasonsData.class).fromJson(rvj0Var.source());
                        if (feedbackReasonsData == null) {
                            feedbackReasonsData = FeedbackReasonsData.a;
                        }
                        return new dg70(feedbackReasonsData);
                    } catch (Exception unused) {
                        return new dg70(FeedbackReasonsData.a);
                    }
                }
                return new dg70(FeedbackReasonsData.a);
            case 27:
                ouu ouuVar = ((fxj0) obj).c;
                ouuVar.getClass();
                return ouu.b(ouuVar, "invite", ChatData.class, kvj0Var);
            case 28:
                ouu ouuVar2 = ((fxj0) obj).c;
                ouuVar2.getClass();
                return ouu.b(ouuVar2, "join_to_thread", JoinThreadData.class, kvj0Var);
            default:
                ouu ouuVar3 = ((fxj0) obj).c;
                ouuVar3.getClass();
                return ouu.b(ouuVar3, "create_chat", GroupChatData.class, kvj0Var);
        }
    }

    @Override // defpackage.w920
    public boolean e(ngz ngzVar) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((bp5) obj).mo103c(ngzVar.b);
                return true;
            case 1:
            case 2:
            case 3:
            case 5:
            case 9:
            case 13:
            case 16:
            case 24:
            case 26:
            case 27:
            case 28:
            default:
                return super.e(ngzVar);
            case 4:
                boolean z = ngzVar.b == 403;
                if (z) {
                    q3f0 q3f0Var = ((to3) this.b).g;
                    z83.g(null, q3f0Var.a.get(), Looper.myLooper());
                    q3f0Var.b.post(new p3f0(q3f0Var));
                }
                ((fo3) obj).g(z ? Error.PRIVACY_RESTRICTIONS : Error.GENERIC);
                return true;
            case 6:
                ((fo3) obj).g(Error.GENERIC);
                return false;
            case 7:
                if (ngzVar.b != 404) {
                    return false;
                }
                ((fo3) obj).g(Error.ALIAS_INVALID);
                return true;
            case 8:
                c29 c29Var = (c29) obj;
                int i2 = ngzVar.b;
                if (i2 == 404) {
                    c29Var.g(Error.INVITE_LINK_INVALID);
                } else {
                    if (i2 != 403) {
                        return false;
                    }
                    c29Var.g(Error.GENERIC);
                }
                return true;
            case 10:
                ((bp5) obj).mo103c(ngzVar.b);
                return false;
            case 11:
                ((m7b) obj).mo103c(ngzVar.b);
                return false;
            case 12:
                return false;
            case 14:
                return ((ho3) obj).mo103c(ngzVar.b);
            case 15:
                ((bp5) obj).mo103c(ngzVar.b);
                return true;
            case 17:
                return ((ho3) obj).mo103c(ngzVar.b);
            case 18:
                ((uk10) obj).mo103c(ngzVar.b);
                return false;
            case 19:
                return ((o99) obj).mo103c(ngzVar.b);
            case 20:
                return ((o99) obj).mo103c(ngzVar.b);
            case 21:
                ((yub0) obj).mo103c(ngzVar.b);
                return false;
            case 22:
                ((bp5) obj).mo103c(ngzVar.b);
                return true;
            case 23:
                ((kde) obj).h(new YaDiskErrorInfo(ngzVar.b, ngzVar.c));
                return true;
            case 25:
                ((bp5) obj).mo103c(ngzVar.b);
                return true;
            case 29:
                ((an8) this.w).g(Error.GENERIC);
                return true;
        }
    }

    @Override // defpackage.w920
    public final void g(Object obj) {
        int i = this.a;
        Object obj2 = this.w;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((bp5) obj3).D((EmptyResponse) obj);
                break;
            case 1:
                ((bp5) obj3).D((AddFilesResponse) obj);
                break;
            case 2:
                ((gyc) obj3).D((ContactCheckHashResponse) obj);
                break;
            case 3:
                ((yzh) obj3).D((ContactData[]) obj);
                break;
            case 4:
                CreatePrivateChatData createPrivateChatData = (CreatePrivateChatData) obj;
                ((fo3) obj3).h(createPrivateChatData.chat, createPrivateChatData.user);
                break;
            case 5:
                ((bp5) obj3).D((BucketsData) obj);
                break;
            case 6:
                fo3 fo3Var = (fo3) obj3;
                ChatData[] chatDataArr = ((GetChatInfoData) obj).chats;
                if (chatDataArr.length == 0) {
                    fo3Var.g(Error.GENERIC);
                    break;
                } else {
                    fo3Var.h(chatDataArr[0], null);
                    break;
                }
            case 7:
                fo3 fo3Var2 = (fo3) obj3;
                ChatData[] chatDataArr2 = ((GetChatInfoData) obj).chats;
                if (chatDataArr2.length == 0) {
                    fo3Var2.g(Error.ALIAS_INVALID);
                    break;
                } else {
                    fo3Var2.h(chatDataArr2[0], null);
                    break;
                }
            case 8:
                c29 c29Var = (c29) obj3;
                ChatData[] chatDataArr3 = ((GetChatInfoData) obj).chats;
                if (chatDataArr3.length == 0) {
                    c29Var.g(Error.INVITE_LINK_INVALID);
                    break;
                } else {
                    c29Var.h(chatDataArr3[0], null);
                    break;
                }
            case 9:
                ((bp5) obj3).D((ChatSettingsParams) obj);
                break;
            case 10:
                ((bp5) obj3).D((GetChatInfoData) obj);
                break;
            case 11:
                ((m7b) obj3).D((MediaMessageListData) obj);
                break;
            case 12:
                md6 md6Var = (md6) obj3;
                ChatData[] chatDataArr4 = ((GetChatInfoData) obj).chats;
                if (chatDataArr4.length == 0) {
                    md6Var.o(null);
                    break;
                } else {
                    md6Var.o(chatDataArr4[0]);
                    break;
                }
            case 13:
                RecommendedUser[] users = ((RecommendedUsersData) obj).getUsers();
                if (users != null) {
                    bp5 bp5Var = (bp5) obj3;
                    ArrayList arrayList = new ArrayList(users.length);
                    for (RecommendedUser recommendedUser : users) {
                        arrayList.add(recommendedUser.getGuid());
                    }
                    bp5Var.D((String[]) arrayList.toArray(new String[0]));
                    break;
                }
                break;
            case 14:
                ((ho3) obj3).D(((StaffUserDataData) obj).getUser());
                break;
            case 15:
                ((bp5) obj3).D((GetSuggestData) obj);
                break;
            case 16:
                ((bp5) obj3).D((GetUrlPreviewResponse) obj);
                break;
            case 17:
                ((ho3) obj3).D((UserData) obj);
                break;
            case 18:
                ((uk10) obj3).D((UsersData) obj);
                break;
            case 19:
                ((o99) obj3).D((EmptyResponse) obj);
                break;
            case 20:
                ((o99) obj3).D((JoinThreadData) obj);
                break;
            case 21:
                ((yub0) obj3).D((BucketsData) obj);
                break;
            case 22:
                ((bp5) obj3).D((ResolveInviteLinkTokenResponse) obj);
                break;
            case 23:
                ((kde) obj3).g((ResolveYaDiskResponse) obj);
                break;
            case 24:
                ((bp5) obj3).D((ShareFileResponse) obj);
                break;
            case 25:
                ((bp5) obj3).D((BucketsData) obj);
                break;
            case 26:
                u1n u1nVar = (u1n) obj3;
                ((Handler) ((wjm) u1nVar.b).w).post(new qpo(6, (v1b) u1nVar.c, (FeedbackReasonsData) obj));
                break;
            case 27:
                ((g4b) obj2).D((ChatData) obj);
                break;
            case 28:
                ((g4b) obj2).D((JoinThreadData) obj);
                break;
            default:
                GroupChatData groupChatData = (GroupChatData) obj;
                ((fxj0) obj3).a.a(groupChatData.getErrors());
                ((an8) obj2).h(groupChatData.getChatData(), null);
                break;
        }
    }

    @Override // defpackage.w920
    public void h() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 6:
                ((fo3) obj).g(Error.GENERIC);
                break;
            case 23:
                if (!((to3) this.b).h.a(tz10.n)) {
                    ((kde) obj).h(new YaDiskErrorInfo(-1, null));
                    break;
                }
                break;
        }
    }

    @Override // defpackage.w920
    public final t4j0 i() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.w;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                return ((to3) obj3).b.a((ActivateChatRequestParams) obj2, "activate_chat");
            case 1:
                return ((to3) obj3).b.a((AddFilesParams) obj2, "add_files");
            case 2:
                return ((to3) obj3).b.a((ContactCheckHashParam) obj2, "contact_check_hash");
            case 3:
                t4j0 a = ((to3) obj3).b.a((ContactsDownloadParam) obj2, "list_contacts");
                if (a.a == null) {
                    ny61.r("url == null");
                    return null;
                }
                a.c.d();
                m5j0 m5j0Var = a.d;
                if (m5j0Var != null) {
                    m5j0Var.a();
                }
                return a;
            case 4:
                return ((to3) obj3).b.a((CreatePrivateChatParam) obj2, "create_private_chat");
            case 5:
                return ((to3) obj3).b.a(new GetBucketsParams((Map) obj2), "get_buckets");
            case 6:
                return ((to3) obj3).b.a(new GetChatInfoParam((String[]) obj2), "get_chats_info");
            case 7:
                return ((to3) obj3).b.a((GetChatInfoByAlias) obj2, "get_chats_info");
            case 8:
                return ((to3) obj3).b.a((GetChatDataByInviteHashParams) obj2, "get_chats_info");
            case 9:
                return ((to3) obj3).b.a((GetChatSettingsParams) obj2, "get_chat_settings");
            case 10:
                return ((to3) obj3).b.a(new GetChatInfoParam((String[]) obj2), "get_chats_info");
            case 11:
                return ((to3) obj3).b.a((GetMediaMessagesParams) obj2, "get_media_messages");
            case 12:
                return ((to3) obj3).b.a(new GetChatInfoParam((String[]) obj2), "get_chats_info");
            case 13:
                return ((to3) obj3).b.a((RecommendedUsersParams) obj2, "get_recommended_users");
            case 14:
                return ((to3) obj3).b.a((GetStaffDataParam) obj2, "get_user_by_nickname");
            case 15:
                return ((to3) obj3).b.a((GetSuggestParam) obj2, "get_suggest");
            case 16:
                return ((to3) obj3).b.a((GetUrlPreviewRequestParam) obj2, "get_url_preview");
            case 17:
                return ((to3) obj3).b.a((GetUsersDataParam) obj2, "get_users_data");
            case 18:
                return ((to3) obj3).b.a((GetUsersDataParam) obj2, "get_users_data");
            case 19:
                return ((to3) obj3).b.a((LeaveParams) obj2, "leave");
            case 20:
                return ((to3) obj3).b.a((LeaveThreadParams) obj2, "leave_thread");
            case 21:
                return ((to3) obj3).b.a((PinnedChatsBucket) obj2, "set_bucket");
            case 22:
                return ((to3) obj3).b.a(new ResolveInviteLinkTokenParams((String) obj2), "resolve_token");
            case 23:
                to3 to3Var = (to3) obj3;
                t4j0 a2 = to3Var.b.a((ResolveYaDiskParams) obj2, "upload_to_disk");
                String deviceId = AppMetricaYandex.getDeviceId(((gm51) to3Var.i).a);
                if (deviceId != null) {
                    a2.a(ManifestApiImpl.HEADER_DEVICE_ID, deviceId);
                }
                return a2;
            case 24:
                return ((to3) obj3).b.a((ShareFileParams) obj2, "share_file");
            case 25:
                return ((to3) obj3).b.a((FoldersBucket) obj2, "set_bucket");
            case 26:
                t4j0 b = ((w3i) obj3).b();
                m5z m5zVar = (m5z) obj2;
                int min = Math.min(m5zVar.d(), 6);
                StringBuilder sb = new StringBuilder();
                for (int i2 = 0; i2 < min; i2++) {
                    Locale locale = Locale.US;
                    Locale b2 = m5zVar.b(i2);
                    sb.append(String.format(locale, "%s;q=%.1f", Arrays.copyOf(new Object[]{b2 != null ? b2.getLanguage() : null, Double.valueOf(1.0d - (i2 * 0.1d))}, 2)));
                    if (i2 != min - 1) {
                        sb.append(Extension.FIX_SPACE);
                    }
                }
                b.c.a("Accept-Language", sb.toString());
                return b;
            case 27:
                return ((fxj0) obj).c.a((JoinParams) obj3, "invite");
            case 28:
                return ((fxj0) obj).c.a((JoinThreadParams) obj3, "join_to_thread");
            default:
                return ((fxj0) obj).c.a((CreateGroupChatParam) obj3, "create_chat");
        }
    }

    @Override // defpackage.w920
    public int j() {
        switch (this.a) {
            case 11:
                return Integer.MAX_VALUE;
            case 23:
                return !((to3) this.b).h.a(tz10.n) ? 1 : 3;
            default:
                return super.j();
        }
    }

    @Override // defpackage.w920
    public boolean m(int i) {
        switch (this.a) {
            case 23:
                Set set = yj51.d;
                if (!yj51.d.contains(Integer.valueOf(i))) {
                    break;
                }
                break;
        }
        return super.m(i);
    }

    public /* synthetic */ io3(fxj0 fxj0Var, Object obj, Object obj2, int i) {
        this.a = i;
        this.c = fxj0Var;
        this.b = obj;
        this.w = obj2;
    }

    public /* synthetic */ io3(Object obj, to3 to3Var, bp5 bp5Var, int i) {
        this.a = i;
        this.w = obj;
        this.b = to3Var;
        this.c = bp5Var;
    }
}
