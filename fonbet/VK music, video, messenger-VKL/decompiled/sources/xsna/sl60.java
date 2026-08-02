package xsna;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.vk.api.generated.newsfeed.dto.NewsfeedIgnoreItemResponseDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.dto.common.id.UserId;
import com.vk.feed.core.models.news.NewsEntry;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import xsna.r1r0;

/* compiled from: NewsfeedIgnoreItem.java */
/* loaded from: classes4.dex */
public final class sl60 extends awi<a> {
    public final String s;
    public final UserId t;
    public final long u;

    @Nullable
    public final String v;

    @Nullable
    public final String w;

    /* compiled from: NewsfeedIgnoreItem.java */
    public static class a {
        public boolean a;

        @Nullable
        public String b;
        public UserId c = UserId.d;

        @Nullable
        public String d;

        @Nullable
        public String e;
    }

    public sl60(long j, UserId userId, String str, @Nullable String str2, @Nullable String str3) {
        this.v = null;
        this.s = str;
        this.t = userId;
        this.u = j;
        if (!TextUtils.isEmpty(str2)) {
            this.v = str2;
        }
        this.w = str3;
    }

    public static boolean F0(NewsEntry newsEntry) {
        int zb = newsEntry.zb();
        return (zb == 12 || zb == 11 || zb == 29) ? false : true;
    }

    @Override // xsna.xz2, xsna.nx2
    public final Object f(l7r0 l7r0Var) throws InterruptedException, IOException, VKApiException {
        tfx tfxVar = new tfx("newsfeed.ignoreItem", new pn(27), new mr(28));
        tfx.o(tfxVar, "type", this.s, 0, 0, 12);
        UserId userId = this.t;
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        }
        tfx.m(tfxVar, "item_id", this.u, 0L, 8);
        String str = this.v;
        if (str != null) {
            tfx.o(tfxVar, "ref", str, 0, 0, 12);
        }
        String str2 = this.w;
        if (str2 != null) {
            tfx.o(tfxVar, "track_code", str2, 0, 0, 12);
        }
        NewsfeedIgnoreItemResponseDto newsfeedIgnoreItemResponseDto = (NewsfeedIgnoreItemResponseDto) yfb.x(tfxVar).f(l7r0Var);
        a aVar = new a();
        aVar.a = newsfeedIgnoreItemResponseDto.d();
        aVar.b = newsfeedIgnoreItemResponseDto.getMessage();
        if (userId.b > 0 && newsfeedIgnoreItemResponseDto.d()) {
            aVar.c = userId;
            Object[] objArr = {userId};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            Object[] objArr2 = {UsersFieldsDto.FIRST_NAME_GEN, UsersFieldsDto.LAST_NAME_GEN};
            ArrayList arrayList2 = new ArrayList(2);
            for (int i = 0; i < 2; i++) {
                Object obj2 = objArr2[i];
                Objects.requireNonNull(obj2);
                arrayList2.add(obj2);
            }
            List list = (List) yfb.x(r1r0.a.a(unmodifiableList, null, Collections.unmodifiableList(arrayList2), null, null)).f(l7r0Var);
            if (!list.isEmpty()) {
                UsersUserFullDto usersUserFullDto = (UsersUserFullDto) list.get(0);
                aVar.d = usersUserFullDto.N0();
                aVar.e = usersUserFullDto.D1();
            }
        }
        return aVar;
    }
}
