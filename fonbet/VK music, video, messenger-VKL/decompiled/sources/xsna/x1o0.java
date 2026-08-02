package xsna;

import androidx.compose.runtime.a;
import com.google.android.gms.internal.measurement.zznn;
import com.vk.api.generated.catalog.dto.CatalogCoordsDto;
import com.vk.api.generated.catalog.dto.CatalogGroupsItemDto;
import com.vk.api.generated.groups.dto.GroupsGroupFriendsDto;
import com.vk.core.compose.component.defaults.PictureRadius;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.GroupCatalogItem;
import com.vk.dto.group.GroupLikes;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.serialization.KSerializer;
import okio.SegmentedByteString;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: TagsFilter.kt */
@vby
/* loaded from: classes18.dex */
public final class x1o0 implements q701, o320 {
    public static boolean f = true;
    public static final int[] b = {0, 0};
    public static final KSerializer[] c = new KSerializer[0];
    public static final x1o0 d = new x1o0();
    public static final x1o0 e = new x1o0();
    public static final /* synthetic */ x1o0 g = new x1o0();

    public static final znk0 a() {
        return new znk0();
    }

    public static final long b(int i) {
        long j = (i << 32) | (0 & 4294967295L);
        int i2 = bdy.O;
        return j;
    }

    public static final znk0 c() {
        return new znk0();
    }

    public static trl f() {
        return new trl(8);
    }

    public static n3w0 g(ByteArrayInputStream byteArrayInputStream, m3w0 m3w0Var) {
        return new n3w0(byteArrayInputStream, mnf0.d, new pvn(m3w0Var, false));
    }

    public static o3w0 i(ByteArrayOutputStream byteArrayOutputStream, m3w0 m3w0Var) {
        return new o3w0(byteArrayOutputStream, new pvn(m3w0Var, false));
    }

    public static final Object j(zox zoxVar) {
        Object c2 = zoxVar.c();
        doy doyVar = c2 instanceof doy ? (doy) c2 : null;
        if (doyVar != null) {
            return doyVar.p();
        }
        return null;
    }

    public static final us2 k(tho0 tho0Var) {
        us2 us2Var = tho0Var.a;
        long j = tho0Var.b;
        us2Var.getClass();
        return us2Var.subSequence(qko0.f(j), qko0.e(j));
    }

    public static final us2 l(tho0 tho0Var, int i) {
        us2 us2Var = tho0Var.a;
        us2 us2Var2 = tho0Var.a;
        long j = tho0Var.b;
        int e2 = qko0.e(j);
        int e3 = qko0.e(j);
        int i2 = e3 + i;
        if (((i ^ i2) & (e3 ^ i2)) < 0) {
            i2 = us2Var2.c.length();
        }
        return us2Var.subSequence(e2, Math.min(i2, us2Var2.c.length()));
    }

    public static final us2 m(tho0 tho0Var, int i) {
        us2 us2Var = tho0Var.a;
        long j = tho0Var.b;
        int f2 = qko0.f(j);
        int i2 = f2 - i;
        if (((f2 ^ i2) & (i ^ f2)) < 0) {
            i2 = 0;
        }
        return us2Var.subSequence(Math.max(0, i2), qko0.f(j));
    }

    public static sja0 n(rco0 rco0Var, float f2, dhx0 dhx0Var, PictureRadius pictureRadius, androidx.compose.runtime.a aVar, int i) {
        rco0 rco0Var2;
        float f3;
        PictureRadius pictureRadius2;
        jai jaiVar = crx0.h;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1676093508, i, -1, "com.vk.core.compose.component.context.menu.ContextMenuItem.Left.Picture.Companion.invoke (ContextMenuItem.kt:238)");
        }
        int i2 = ((i << 3) & 896) | 24582;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-179965796, i2, -1, "com.vk.core.compose.component.context.menu.remember (PictureImpl.kt:57)");
        }
        List u0 = rl3.u0(new iy5[]{dhx0Var});
        int i3 = 4187134 & i2;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1105661025, i3, -1, "com.vk.core.compose.component.context.menu.remember (PictureImpl.kt:67)");
        }
        Object x = aVar.x();
        a.C0011a.C0012a c0012a = a.C0011a.a;
        tgp tgpVar = tgp.a;
        if (x == c0012a) {
            rco0Var2 = rco0Var;
            f3 = f2;
            pictureRadius2 = pictureRadius;
            sja0 sja0Var = new sja0(rco0Var2, f3, u0, pictureRadius2, tgpVar, jaiVar);
            aVar.R(sja0Var);
            x = sja0Var;
        } else {
            rco0Var2 = rco0Var;
            f3 = f2;
            pictureRadius2 = pictureRadius;
        }
        sja0 sja0Var2 = (sja0) x;
        ((zak0) sja0Var2.a).setValue(rco0Var2);
        ((zak0) sja0Var2.b).setValue(new pco(f3));
        ((zak0) sja0Var2.c).setValue(new wow(u0));
        ((zak0) sja0Var2.d).setValue(pictureRadius2);
        ((zak0) sja0Var2.e).setValue(tgpVar);
        ((zak0) sja0Var2.f).setValue(jaiVar);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return sja0Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static GroupCatalogItem o(CatalogGroupsItemDto catalogGroupsItemDto) {
        GroupLikes groupLikes;
        Float e2;
        Float d2;
        long j = catalogGroupsItemDto.i().b;
        String description = catalogGroupsItemDto.getDescription();
        Integer f2 = catalogGroupsItemDto.f();
        int intValue = f2 != null ? f2.intValue() : 0;
        String r = catalogGroupsItemDto.r();
        GroupsGroupFriendsDto g2 = catalogGroupsItemDto.g();
        JSONObject jSONObject = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (g2 != null) {
            groupLikes = new GroupLikes(jSONObject, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0);
            groupLikes.b = catalogGroupsItemDto.i();
            groupLikes.d = g2.getCount();
            groupLikes.f.addAll(g2.d());
        } else {
            groupLikes = null;
        }
        String d3 = catalogGroupsItemDto.d();
        if (d3 == null) {
            d3 = catalogGroupsItemDto.k();
        }
        String str = d3;
        CatalogCoordsDto e3 = catalogGroupsItemDto.e();
        double floatValue = (e3 == null || (d2 = e3.d()) == null) ? Double.NaN : d2.floatValue();
        CatalogCoordsDto e4 = catalogGroupsItemDto.e();
        return new GroupCatalogItem(j, description, intValue, r, groupLikes, str, floatValue, (e4 == null || (e2 = e4.e()) == null) ? Double.NaN : e2.floatValue(), catalogGroupsItemDto.j() != null ? r15.floatValue() : Double.NaN);
    }

    public static final int p(SegmentedByteString segmentedByteString, int i) {
        int i2;
        int[] iArr = segmentedByteString.f;
        int i3 = i + 1;
        int length = segmentedByteString.e.length - 1;
        int i4 = 0;
        while (true) {
            if (i4 <= length) {
                i2 = (i4 + length) >>> 1;
                int i5 = iArr[i2];
                if (i5 >= i3) {
                    if (i5 <= i3) {
                        break;
                    }
                    length = i2 - 1;
                } else {
                    i4 = i2 + 1;
                }
            } else {
                i2 = (-i4) - 1;
                break;
            }
        }
        return i2 >= 0 ? i2 : ~i2;
    }

    public static final void q(AtomicReference atomicReference, boolean z) {
        atomicReference.set(new wn60(wn60.a(((wn60) atomicReference.get()).a, false, false, false, false, z, 15)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static rhm0 r(String str) {
        String str2 = null;
        Object[] objArr = 0;
        if (str == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        UserId userId = new UserId(jSONObject.getLong("uid"));
        String string = jSONObject.getString("fullName");
        String string2 = jSONObject.getString("firstName");
        JSONArray optJSONArray = jSONObject.optJSONArray("image");
        return new rhm0(userId, string, string2, optJSONArray != null ? new Image(optJSONArray, str2, 2, objArr == true ? 1 : 0) : null, jSONObject.getString("photo"), jSONObject.getBoolean("canMessage"), jSONObject.getBoolean("isLiked"), Integer.valueOf(jSONObject.optInt("reactionId")), jSONObject.optBoolean("isVerified", false), jSONObject.optBoolean("isTrending", false), jSONObject.optBoolean("isOauthVerified", false));
    }

    public static final int s(int i, int i2) {
        if (i == Integer.MAX_VALUE) {
            return i;
        }
        int i3 = i - i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    public static String t(List list) {
        return "TagsFilter(tagIds=" + list + ')';
    }

    @Override // xsna.o320
    public String d(i420 i420Var, String str) {
        if (i420Var instanceof b9z) {
            return super.h((b9z) i420Var, str);
        }
        if (!(i420Var instanceof ogq0)) {
            return "";
        }
        StringBuilder sb = new StringBuilder("@");
        UserId userId = ((ogq0) i420Var).b;
        sb.append(fkq0.b(userId) ? "club" : "id");
        sb.append(Math.abs(userId.b));
        sb.append(" (");
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean e() {
        boolean z;
        if (f) {
            com.vk.core.utils.newtork.b.a.getClass();
            if (com.vk.core.utils.newtork.b.d()) {
                z = true;
                if (z) {
                    f = false;
                }
                return z;
            }
        }
        z = false;
        if (z) {
        }
        return z;
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Integer.valueOf((int) zznn.zzw());
    }
}
