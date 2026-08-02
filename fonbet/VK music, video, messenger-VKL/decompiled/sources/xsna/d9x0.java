package xsna;

import android.util.SparseArray;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.groups.dto.GroupsGroupIsClosedDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.utils.dto.UtilsCheckObsceneTextDictionaryDto;
import com.vk.api.generated.wall.dto.WallCreateCommentEntryPointDto;
import com.vk.api.generated.wall.dto.WallCreateCommentResponseDto;
import com.vk.api.parsers.BadgesParsers;
import com.vk.core.serialize.Serializer;
import com.vk.dto.badges.BadgeItem;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.PostAuthor;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.common.requests.CommentRestrictedResponse;
import com.vkontakte.android.attachments.StickerAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.utils.Logger;
import xsna.s1r0;
import xsna.xqu;

/* compiled from: WallAddCommentRequest.kt */
/* loaded from: classes4.dex */
public final class d9x0 extends awi<NewsComment> {
    public final WallCreateCommentEntryPointDto A;
    public final UserId B;
    public final int C;
    public final int D;
    public final String E;
    public final List<Attachment> F;
    public final int s;
    public final String t;
    public final UserId u;
    public final boolean v;
    public final boolean w;
    public final String x;
    public final String y;
    public final long z;

    /* compiled from: WallAddCommentRequest.kt */
    public static final class a {
        public final String a;
        public final List<Attachment> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, List<? extends Attachment> list) {
            this.a = str;
            this.b = list;
        }
    }

    /* compiled from: WallAddCommentRequest.kt */
    public static final class b {
        public final UserId a;
        public final int b;
        public final int c;

        public b(UserId userId, int i, int i2) {
            this.a = userId;
            this.b = i;
            this.c = i2;
        }
    }

    public d9x0(b bVar, a aVar, int i, String str, UserId userId, boolean z, boolean z2, String str2, String str3, long j, WallCreateCommentEntryPointDto wallCreateCommentEntryPointDto) {
        this.s = i;
        this.t = str;
        this.u = userId;
        this.v = z;
        this.w = z2;
        this.x = str2;
        this.y = str3;
        this.z = j;
        this.A = wallCreateCommentEntryPointDto;
        this.B = bVar.a;
        this.C = bVar.b;
        this.D = bVar.c;
        this.E = aVar.a;
        this.F = aVar.b;
    }

    public final Triple<List<String>, Integer, String> F0() {
        List<Attachment> list = this.F;
        if (j5g.a0(list) instanceof StickerAttachment) {
            StickerAttachment stickerAttachment = (StickerAttachment) j5g.Y(list);
            EmptyList emptyList = EmptyList.b;
            Integer valueOf = Integer.valueOf(stickerAttachment.f.b);
            String str = stickerAttachment.h;
            return new Triple<>(emptyList, valueOf, str != null ? cqm0.a(str) : null);
        }
        List<Attachment> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Attachment) it.next()).toString());
        }
        return new Triple<>(arrayList, null, null);
    }

    public final UserId H0() {
        UserId userId = this.u;
        if (userId != null && userId.b == 0) {
            return null;
        }
        if (this.D != 0) {
            return new UserId(1L);
        }
        if (userId != null) {
            return fkq0.a(userId);
        }
        return null;
    }

    public final JSONObject K0(l7r0 l7r0Var) {
        UserId userId;
        Triple<List<String>, Integer, String> F0 = F0();
        List<String> d = F0.d();
        Integer g = F0.g();
        String h = F0.h();
        UserId H0 = H0();
        int i = this.s;
        if (i == -1) {
            i = 0;
        }
        String a2 = cqm0.a(this.y);
        tfx tfxVar = new tfx("wall.createComment", new wd10(19), new nyh0(8));
        tfx.l(tfxVar, "post_id", this.C, 0, 0, 8);
        UserId userId2 = this.B;
        if (userId2 != null) {
            tfx.n(tfxVar, "owner_id", userId2, 0L, 0L, 12);
        }
        if (H0 != null) {
            tfx.n(tfxVar, "from_group", H0, 0L, 0L, 8);
            tfxVar = tfxVar;
        }
        String str = this.E;
        if (str != null) {
            tfx.o(tfxVar, "message", str, 0, 0, 12);
        }
        tfx.l(tfxVar, "reply_to_comment", i, 0, 0, 12);
        if (d != null) {
            tfxVar.i("attachments", d);
        }
        if (g != null) {
            tfx.l(tfxVar, "sticker_id", g.intValue(), 0, 0, 8);
        }
        if (h != null) {
            userId = userId2;
            tfx.o(tfxVar, "sticker_referrer", h, 0, 0, 12);
        } else {
            userId = userId2;
        }
        String str2 = this.x;
        if (str2 != null) {
            tfx.o(tfxVar, "ref", str2, 0, 0, 12);
        }
        if (a2 != null) {
            tfx.o(tfxVar, "track_code", a2, 0, 0, 12);
        }
        WallCreateCommentEntryPointDto wallCreateCommentEntryPointDto = this.A;
        if (wallCreateCommentEntryPointDto != null) {
            tfx.o(tfxVar, "entry_point", wallCreateCommentEntryPointDto.i(), 0, 0, 12);
        }
        return (JSONObject) yfb.z(lax0.a(new max0(), ((WallCreateCommentResponseDto) yfb.x(tfxVar).f(l7r0Var)).d(), userId, e43.l(BaseUserGroupFieldsDto.FIRST_NAME_DAT, BaseUserGroupFieldsDto.LAST_NAME_DAT, BaseUserGroupFieldsDto.VERIFIED, BaseUserGroupFieldsDto.TRENDING, BaseUserGroupFieldsDto.PHOTO_BASE, BaseUserGroupFieldsDto.EMOJI_STATUS, BaseUserGroupFieldsDto.IMAGE_STATUS, BaseUserGroupFieldsDto.IS_NFT, BaseUserGroupFieldsDto.IS_NFT_PHOTO), 48), new zzl0(14)).f(l7r0Var);
    }

    public final void N0(String str, UserId userId, boolean z, l7r0 l7r0Var) {
        Object failure;
        JSONObject put = new JSONObject().put(Logger.METHOD_E, "comment_restriction").put("type", str).put("user_id", userId);
        StringBuilder sb = new StringBuilder();
        sb.append(this.B);
        sb.append('_');
        sb.append(this.C);
        try {
            failure = (BaseOkResponseDto) yfb.x(sd9.t(new JSONArray().put(put.put("post_id", sb.toString()).put("timestamp", this.z).put("check_result", z)).toString())).f(l7r0Var);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a2 = Result.a(failure);
        if (a2 != null) {
            com.vk.metrics.eventtracking.b.a.a(a2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x012f  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r0v93 */
    /* JADX WARN: Type inference failed for: r0v94 */
    /* JADX WARN: Type inference failed for: r0v95 */
    /* JADX WARN: Type inference failed for: r0v96 */
    /* JADX WARN: Type inference failed for: r0v97 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r12v3, types: [xsna.tfx, xsna.xy2] */
    /* JADX WARN: Type inference failed for: r14v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r5v33, types: [java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [com.vk.dto.newsfeed.PostAuthor] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    @Override // xsna.xz2, xsna.nx2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(l7r0 l7r0Var) {
        int i;
        String str;
        tfx tfxVar;
        String str2;
        ?? r14;
        JSONObject jSONObject;
        Object failure;
        ?? r3;
        Object failure2;
        ?? r0;
        ?? r6;
        Owner owner;
        xy2 o;
        boolean z;
        GroupsGroupFullDto groupsGroupFullDto;
        Object obj;
        int i2;
        Object failure3;
        Object obj2;
        Throwable a2;
        UtilsCheckObsceneTextDictionaryDto utilsCheckObsceneTextDictionaryDto;
        int i3;
        tfx tfxVar2;
        ?? r5;
        Object failure4;
        Throwable a3;
        UserId userId;
        JSONObject K0;
        String str3;
        boolean z2 = true;
        int i4 = this.s;
        String str4 = this.E;
        UserId userId2 = this.B;
        boolean z3 = false;
        int i5 = this.D;
        if (i5 == 1) {
            Triple<List<String>, Integer, String> F0 = F0();
            List<String> d = F0.d();
            Integer g = F0.g();
            String h = F0.h();
            UserId H0 = H0();
            boolean z4 = H0 != null && H0.b == 1;
            int i6 = i4 == -1 ? 0 : i4;
            tfx tfxVar3 = new tfx("photos.createComment", new t11(29), new a690(1));
            tfx.l(tfxVar3, "photo_id", this.C, 0, 0, 12);
            if (userId2 != null) {
                i = 0;
                str = null;
                tfx.n(tfxVar3, "owner_id", userId2, 0L, 0L, 12);
            } else {
                i = 0;
                str = null;
            }
            if (str4 != null) {
                tfxVar = tfxVar3;
                tfx.o(tfxVar, "message", str4, 0, 0, 12);
            } else {
                tfxVar = tfxVar3;
            }
            if (d != null) {
                tfxVar.i("attachments", d);
            }
            tfxVar.j("from_group", z4);
            tfx tfxVar4 = tfxVar;
            tfx.l(tfxVar4, "reply_to_comment", i6, 0, 0, 12);
            if (g != null) {
                tfx.l(tfxVar4, "sticker_id", g.intValue(), 0, 0, 8);
            }
            String str5 = this.t;
            if (str5 != null) {
                str2 = str5;
                tfx.o(tfxVar4, "access_key", str2, 0, 0, 12);
            } else {
                str2 = str5;
            }
            if (h != null) {
                tfx.o(tfxVar4, "sticker_referrer", h, 0, 0, 12);
            }
            int intValue = ((Number) yfb.x(tfxVar4).f(l7r0Var)).intValue();
            List l = e43.l(UsersFieldsDto.FIRST_NAME_DAT, UsersFieldsDto.LAST_NAME_DAT, UsersFieldsDto.VERIFIED, UsersFieldsDto.TRENDING, UsersFieldsDto.PHOTO_BASE, UsersFieldsDto.EMOJI_STATUS, UsersFieldsDto.IMAGE_STATUS, UsersFieldsDto.IS_NFT);
            ?? tfxVar5 = new tfx("photos.getComments", new s11(23), new to(26));
            tfx.l(tfxVar5, "photo_id", this.C, 0, 0, 12);
            if (userId2 != null) {
                tfx.n(tfxVar5, "owner_id", userId2, 0L, 0L, 12);
            }
            tfx.l(tfxVar5, "start_comment_id", intValue, 0, 0, 8);
            tfxVar5.f(1, i, 100, "count");
            if (str2 != null) {
                tfx.o(tfxVar5, "access_key", str2, 0, 0, 12);
            }
            tfxVar5.j("extended", true);
            if (l != null) {
                List list = l;
                r14 = new ArrayList(c5g.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    r14.add(((UsersFieldsDto) it.next()).i());
                }
            } else {
                r14 = str;
            }
            if (r14 != 0) {
                tfxVar5.i("fields", r14);
            }
            jSONObject = (JSONObject) yfb.z(tfxVar5, new ubj0(12)).f(l7r0Var);
        } else if (i5 == 2 || i5 == 6) {
            Triple<List<String>, Integer, String> F02 = F0();
            List<String> d2 = F02.d();
            Integer g2 = F02.g();
            String h2 = F02.h();
            uft0 uft0Var = new uft0();
            if (i4 == -1) {
                i4 = 0;
            }
            UserId H02 = H0();
            o = uft0Var.o(this.C, this.B, this.t, this.E, d2, Boolean.valueOf(H02 != null && H02.b == 1), Integer.valueOf(i4), g2, (r33 & 256) != 0 ? null : null, h2, null, this.x, this.y, (r33 & 8192) != 0 ? null : null, null);
            jSONObject = (JSONObject) yfb.z(tft0.y(new uft0(), this.C, this.B, this.t, Integer.valueOf(((Number) yfb.x(o).f(l7r0Var)).intValue()), 1, drm0.b0("first_name_dat,last_name_dat,verified,trending,photo_base,emoji_status,image_status,is_nft,is_nft_photo", new char[]{','}, 0, 6), 31144), new ygm0(12)).f(l7r0Var);
            i = 0;
            str = null;
        } else {
            if (this.v) {
                long j = userId2.b;
                if (j > 0) {
                    List singletonList = Collections.singletonList(userId2);
                    if ((62 & 1) != 0) {
                        singletonList = null;
                    }
                    UsersUserFullDto usersUserFullDto = (UsersUserFullDto) j5g.a0((List) yfb.x(s1r0.a.b(singletonList, null, null, null, null)).f(l7r0Var));
                    if (usersUserFullDto != null) {
                        z = epx.f(usersUserFullDto.T2(), Boolean.TRUE);
                        if (z) {
                            if (drm0.N(str4)) {
                                r5 = 0;
                                i2 = 0;
                            } else {
                                try {
                                    utilsCheckObsceneTextDictionaryDto = UtilsCheckObsceneTextDictionaryDto.BULLYING;
                                    i3 = (int) userId2.b;
                                    try {
                                        tfxVar2 = new tfx("utils.checkObsceneText", new d4r0(0), new e630(10));
                                        obj = null;
                                        i2 = 0;
                                    } catch (Throwable th) {
                                        th = th;
                                        obj = null;
                                        i2 = 0;
                                        failure3 = new Result.Failure(th);
                                        obj2 = obj;
                                        a2 = Result.a(failure3);
                                        if (a2 != null) {
                                        }
                                        if (failure3 instanceof Result.Failure) {
                                        }
                                        z3 = epx.f(failure3, Boolean.TRUE);
                                        r5 = obj2;
                                        failure4 = ((UsersUserFullDto) j5g.Y((List) yfb.x(s1r0.a.b(r5, r5, r5, r5, r5)).f(l7r0Var))).s1();
                                        a3 = Result.a(failure4);
                                        if (a3 != null) {
                                        }
                                        if (failure4 instanceof Result.Failure) {
                                        }
                                        userId = (UserId) failure4;
                                        if (this.w) {
                                        }
                                        if (userId != null) {
                                        }
                                        jSONObject = K0(l7r0Var);
                                        str3 = r5;
                                        str = str3;
                                        i = i2;
                                        if (jSONObject == null) {
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    obj = null;
                                }
                                try {
                                    tfx.o(tfxVar2, "text", str4, 0, 0, 12);
                                    tfx.l(tfxVar2, "post_owner_id", i3, 0, 0, 12);
                                    if (utilsCheckObsceneTextDictionaryDto != null) {
                                        tfx.o(tfxVar2, "dictionary", utilsCheckObsceneTextDictionaryDto.i(), 0, 0, 12);
                                    }
                                    if (yfb.x(tfxVar2).f(l7r0Var) != BaseBoolIntDto.YES) {
                                        z2 = false;
                                    }
                                    failure3 = Boolean.valueOf(z2);
                                    obj2 = null;
                                } catch (Throwable th3) {
                                    th = th3;
                                    failure3 = new Result.Failure(th);
                                    obj2 = obj;
                                    a2 = Result.a(failure3);
                                    if (a2 != null) {
                                    }
                                    if (failure3 instanceof Result.Failure) {
                                    }
                                    z3 = epx.f(failure3, Boolean.TRUE);
                                    r5 = obj2;
                                    failure4 = ((UsersUserFullDto) j5g.Y((List) yfb.x(s1r0.a.b(r5, r5, r5, r5, r5)).f(l7r0Var))).s1();
                                    a3 = Result.a(failure4);
                                    if (a3 != null) {
                                    }
                                    if (failure4 instanceof Result.Failure) {
                                    }
                                    userId = (UserId) failure4;
                                    if (this.w) {
                                    }
                                    if (userId != null) {
                                    }
                                    jSONObject = K0(l7r0Var);
                                    str3 = r5;
                                    str = str3;
                                    i = i2;
                                    if (jSONObject == null) {
                                    }
                                }
                                a2 = Result.a(failure3);
                                if (a2 != null) {
                                    com.vk.metrics.eventtracking.b.a.a(a2);
                                }
                                if (failure3 instanceof Result.Failure) {
                                    failure3 = obj2;
                                }
                                z3 = epx.f(failure3, Boolean.TRUE);
                                r5 = obj2;
                            }
                            try {
                                failure4 = ((UsersUserFullDto) j5g.Y((List) yfb.x(s1r0.a.b(r5, r5, r5, r5, r5)).f(l7r0Var))).s1();
                            } catch (Throwable th4) {
                                failure4 = new Result.Failure(th4);
                            }
                            a3 = Result.a(failure4);
                            if (a3 != null) {
                                com.vk.metrics.eventtracking.b.a.a(a3);
                            }
                            if (failure4 instanceof Result.Failure) {
                                failure4 = r5;
                            }
                            userId = (UserId) failure4;
                            if (this.w) {
                                if (userId != null) {
                                    N0("check_comment", userId, z3, l7r0Var);
                                }
                                if (z3) {
                                    jSONObject = r5;
                                    str3 = r5;
                                    str = str3;
                                    i = i2;
                                }
                            }
                            if (userId != null) {
                                N0("post_comment", userId, z3, l7r0Var);
                            }
                            jSONObject = K0(l7r0Var);
                            str3 = r5;
                            str = str3;
                            i = i2;
                        } else {
                            K0 = K0(l7r0Var);
                        }
                    }
                    z = false;
                    if (z) {
                    }
                } else {
                    if (j < 0) {
                        List singletonList2 = Collections.singletonList(fkq0.a(userId2));
                        List singletonList3 = Collections.singletonList(GroupsFieldsDto.IS_CLOSED);
                        if ((4 & 2) != 0) {
                            singletonList3 = null;
                        }
                        List<GroupsGroupFullDto> d3 = ((GroupsGetByIdObjectResponseDto) yfb.x(xqu.a.a(null, singletonList2, singletonList3)).f(l7r0Var)).d();
                        if (((d3 == null || (groupsGroupFullDto = (GroupsGroupFullDto) j5g.a0(d3)) == null) ? null : groupsGroupFullDto.u3()) != GroupsGroupIsClosedDto.OPEN) {
                            z = true;
                            if (z) {
                            }
                        }
                    }
                    z = false;
                    if (z) {
                    }
                }
            } else {
                K0 = K0(l7r0Var);
            }
            str3 = null;
            i2 = 0;
            jSONObject = K0;
            str = str3;
            i = i2;
        }
        if (jSONObject == null) {
            return new CommentRestrictedResponse();
        }
        JSONObject jSONObject2 = jSONObject.getJSONArray("items").getJSONObject(i);
        long optLong = jSONObject2.optLong("reply_to_user");
        long optLong2 = jSONObject2.optLong("from_id");
        long optLong3 = jSONObject2.optLong("owner_id");
        ?? r02 = Long.valueOf(optLong);
        if (optLong <= 0) {
            r02 = str;
        }
        List I = rl3.I(new Long[]{r02, optLong2 > 0 ? Long.valueOf(optLong2) : str});
        ArrayList arrayList = new ArrayList(c5g.u(I, 10));
        Iterator it2 = I.iterator();
        while (it2.hasNext()) {
            dq.h(((Number) it2.next()).longValue(), arrayList);
        }
        ?? r03 = Long.valueOf(optLong);
        if (optLong >= 0) {
            r03 = str;
        }
        ?? valueOf = r03 != 0 ? Long.valueOf(Math.abs(r03.longValue())) : str;
        ?? r62 = Long.valueOf(optLong2);
        if (optLong2 >= 0) {
            r62 = str;
        }
        ?? valueOf2 = r62 != 0 ? Long.valueOf(Math.abs(r62.longValue())) : str;
        ?? r7 = Long.valueOf(optLong3);
        if (optLong3 >= 0) {
            r7 = str;
        }
        List I2 = rl3.I(new Long[]{valueOf, valueOf2, r7 != 0 ? Long.valueOf(Math.abs(r7.longValue())) : str});
        ArrayList arrayList2 = new ArrayList(c5g.u(I2, 10));
        Iterator it3 = I2.iterator();
        while (it3.hasNext()) {
            dq.h(((Number) it3.next()).longValue(), arrayList2);
        }
        if (arrayList.isEmpty()) {
            r3 = str;
        } else {
            try {
                int i7 = 58 & 4;
                ?? r04 = e43.l(UsersFieldsDto.FIRST_NAME_DAT, UsersFieldsDto.LAST_NAME_DAT, UsersFieldsDto.VERIFIED, UsersFieldsDto.TRENDING, UsersFieldsDto.PHOTO_BASE, UsersFieldsDto.EMOJI_STATUS, UsersFieldsDto.IMAGE_STATUS, UsersFieldsDto.IS_NFT);
                if (i7 != 0) {
                    r04 = str;
                }
                failure = (JSONArray) yfb.z(s1r0.a.a((58 & 8) != 0 ? str : "dat", arrayList, r04), new pzt0(10)).f(l7r0Var);
            } catch (Throwable th5) {
                failure = new Result.Failure(th5);
            }
            Throwable a4 = Result.a(failure);
            if (a4 != null) {
                com.vk.metrics.eventtracking.b.a.a(a4);
            }
            if (failure instanceof Result.Failure) {
                failure = str;
            }
            r3 = (JSONArray) failure;
        }
        if (arrayList2.isEmpty()) {
            r0 = str;
        } else {
            try {
                int i8 = 4 & 2;
                ?? r05 = e43.l(GroupsFieldsDto.TRENDING, GroupsFieldsDto.VERIFIED);
                if (i8 != 0) {
                    r05 = str;
                }
                failure2 = (JSONArray) yfb.z(xqu.a.a(str, arrayList2, r05), new hwi0(23)).f(l7r0Var);
            } catch (Throwable th6) {
                failure2 = new Result.Failure(th6);
            }
            Throwable a5 = Result.a(failure2);
            if (a5 != null) {
                com.vk.metrics.eventtracking.b.a.a(a5);
            }
            if (failure2 instanceof Result.Failure) {
                failure2 = str;
            }
            r0 = (JSONArray) failure2;
        }
        if (r3 != 0) {
            JSONArray optJSONArray = jSONObject.optJSONArray("profiles");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            int length = r3.length();
            for (int i9 = 0; i9 < length; i9++) {
                optJSONArray.put(r3.getJSONObject(i9));
            }
            jSONObject.put("profiles", optJSONArray);
        }
        if (r0 != 0) {
            JSONArray optJSONArray2 = jSONObject.optJSONArray("groups");
            if (optJSONArray2 == null) {
                optJSONArray2 = new JSONArray();
            }
            int length2 = r0.length();
            for (int i10 = 0; i10 < length2; i10++) {
                optJSONArray2.put(r0.getJSONObject(i10));
            }
            jSONObject.put("groups", optJSONArray2);
        }
        JSONObject jSONObject3 = jSONObject.getJSONArray("items").getJSONObject(0);
        JSONArray optJSONArray3 = jSONObject.optJSONArray("profiles");
        JSONArray optJSONArray4 = jSONObject.optJSONArray("groups");
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (optJSONArray3 != null) {
            int length3 = optJSONArray3.length();
            for (int i11 = 0; i11 < length3; i11++) {
                JSONObject jSONObject4 = optJSONArray3.getJSONObject(i11);
                Serializer.c<Owner> cVar = Owner.CREATOR;
                Owner f = Owner.a.f(jSONObject4);
                hashMap.put(f.b, f);
                if (jSONObject4.has("first_name_dat")) {
                    hashMap2.put(f.b, jSONObject4.getString("first_name_dat"));
                }
            }
        }
        if (optJSONArray4 != null) {
            int length4 = optJSONArray4.length();
            for (int i12 = 0; i12 < length4; i12++) {
                Serializer.c<Owner> cVar2 = Owner.CREATOR;
                Owner d4 = Owner.a.d(optJSONArray4.getJSONObject(i12));
                hashMap.put(d4.b, d4);
            }
        }
        tci.q(jSONObject);
        SparseArray<BadgeItem> b2 = BadgesParsers.b(jSONObject);
        if (!jSONObject.has("post_author_id") || (owner = (Owner) hashMap.get(new UserId(jSONObject.optLong("post_author_id")))) == null) {
            r6 = str;
        } else {
            Serializer.c<PostAuthor> cVar3 = PostAuthor.CREATOR;
            r6 = PostAuthor.a.a(owner);
        }
        jSONObject.optBoolean("can_like_as_author", false);
        return new NewsComment(jSONObject3, new bcg(r6, hashMap, hashMap2, b2, this.D));
    }
}
