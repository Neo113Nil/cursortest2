package xsna;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.dto.common.id.UserId;
import com.vk.music.search.history.SearchHistoryModel;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.List;

/* compiled from: ObjectSearchHistoryModel.kt */
/* loaded from: classes16.dex */
public final class vp70 implements SearchHistoryModel {
    public final SearchHistoryModel.Type a;
    public final UserId b;
    public final String c;
    public final String d;
    public final String e;

    /* compiled from: ObjectSearchHistoryModel.kt */
    public static final class a {
        public static vp70 a(String str) {
            Object obj;
            List c0 = drm0.c0(str, new String[]{HiAnalyticsConstant.REPORT_VAL_SEPARATOR}, 0, 6);
            if (c0.size() != 5) {
                c0 = null;
            }
            if (c0 != null) {
                SearchHistoryModel.Type.a aVar = SearchHistoryModel.Type.Companion;
                String str2 = (String) c0.get(0);
                aVar.getClass();
                Iterator<E> it = SearchHistoryModel.Type.h().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (epx.f(((SearchHistoryModel.Type) obj).i(), str2)) {
                        break;
                    }
                }
                SearchHistoryModel.Type type = (SearchHistoryModel.Type) obj;
                if (type != null) {
                    UserId userId = new UserId(Long.parseLong((String) c0.get(1)));
                    String str3 = (String) c0.get(2);
                    String str4 = (String) c0.get(3);
                    Object obj2 = c0.get(4);
                    if (((String) obj2).length() <= 0) {
                        obj2 = null;
                    }
                    String str5 = (String) obj2;
                    return new vp70(type, userId, str3, str4, str5 != null ? URLDecoder.decode(str5, C.UTF8_NAME) : null);
                }
            }
            return null;
        }
    }

    public vp70(SearchHistoryModel.Type type, UserId userId, String str, String str2, String str3) {
        this.a = type;
        this.b = userId;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vp70)) {
            return false;
        }
        vp70 vp70Var = (vp70) obj;
        return this.a == vp70Var.a && epx.f(this.b, vp70Var.b) && epx.f(this.c, vp70Var.c) && epx.f(this.d, vp70Var.d) && epx.f(this.e, vp70Var.e);
    }

    @Override // com.vk.music.search.history.SearchHistoryModel
    public final String getId() {
        return this.c;
    }

    @Override // com.vk.music.search.history.SearchHistoryModel
    public final SearchHistoryModel.Type getType() {
        return this.a;
    }

    public final int hashCode() {
        int a2 = urd0.a(bh10.a(this.a.hashCode() * 31, 31, this.b.b), 31, this.c);
        String str = this.d;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.vk.music.search.history.SearchHistoryModel
    public final UserId q() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ObjectSearchHistoryModel(type=");
        sb.append(this.a);
        sb.append(", ownerId=");
        sb.append(this.b);
        sb.append(", id=");
        sb.append(this.c);
        sb.append(", accessKey=");
        sb.append(this.d);
        sb.append(", query=");
        return ho8.a(sb, this.e, ')');
    }
}
