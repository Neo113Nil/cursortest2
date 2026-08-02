package xsna;

import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.X3;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Caption;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.libvideo.api.minimizable.TypeScreen;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.log.L;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: FocusChangedModifier.kt */
/* loaded from: classes11.dex */
public final class fvr implements o320, io.reactivex.rxjava3.functions.c, l100, tan0 {
    public static final SerialDescriptor[] b = new SerialDescriptor[0];
    public static nsd c;

    public static final TypeScreen A(VideoMinimizableState videoMinimizableState) {
        if (videoMinimizableState instanceof VideoMinimizableState.Expanded) {
            return TypeScreen.DISCOVERY;
        }
        if (videoMinimizableState instanceof VideoMinimizableState.Collapsed) {
            return TypeScreen.MINIMIZED;
        }
        if (videoMinimizableState instanceof VideoMinimizableState.FullscreenVertical) {
            return TypeScreen.FULLSCREEN_PORTRAIT;
        }
        if (videoMinimizableState instanceof VideoMinimizableState.FullscreenHorizontal) {
            return TypeScreen.FULLSCREEN_LANDSCAPE;
        }
        if (videoMinimizableState instanceof VideoMinimizableState.Pip) {
            return TypeScreen.PIP;
        }
        if ((videoMinimizableState instanceof VideoMinimizableState.Animating) || (videoMinimizableState instanceof VideoMinimizableState.Hidden) || (videoMinimizableState instanceof VideoMinimizableState.PreparedToPip)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final JSONArray B(JSONArray jSONArray) {
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj != null) {
                if (obj instanceof String) {
                    String str = h900.a;
                    jSONArray.put(i, h900.a((String) obj));
                } else if (obj instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj;
                    C(jSONObject);
                    jSONArray.put(i, jSONObject);
                } else if (obj instanceof JSONArray) {
                    JSONArray jSONArray2 = (JSONArray) obj;
                    B(jSONArray2);
                    jSONArray.put(i, jSONArray2);
                }
            }
        }
        return jSONArray;
    }

    public static final JSONObject C(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj != null) {
                if (obj instanceof String) {
                    String str = h900.a;
                    jSONObject.put(next, h900.a((String) obj));
                } else if (obj instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    C(jSONObject2);
                    jSONObject.put(next, jSONObject2);
                } else if (obj instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj;
                    B(jSONArray);
                    jSONObject.put(next, jSONArray);
                }
            }
        }
        return jSONObject;
    }

    public static final Set f(SerialDescriptor serialDescriptor) {
        if (serialDescriptor instanceof jy8) {
            return ((jy8) serialDescriptor).a();
        }
        HashSet hashSet = new HashSet(serialDescriptor.c());
        int c2 = serialDescriptor.c();
        for (int i = 0; i < c2; i++) {
            hashSet.add(serialDescriptor.d(i));
        }
        return hashSet;
    }

    public static final void g(izs izsVar, Object obj, kotlin.coroutines.d dVar) {
        UndeliveredElementException i = i(izsVar, obj, null);
        if (i != null) {
            rvj.a(dVar, i);
        }
    }

    public static final UndeliveredElementException i(izs izsVar, Object obj, UndeliveredElementException undeliveredElementException) {
        try {
            izsVar.invoke(obj);
            return undeliveredElementException;
        } catch (Throwable th) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th) {
                return new UndeliveredElementException(cqi.c(obj, "Exception in undelivered element handler for "), th);
            }
            mnh0.d(undeliveredElementException, th);
            return undeliveredElementException;
        }
    }

    public static final SerialDescriptor[] k(List list) {
        SerialDescriptor[] serialDescriptorArr;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (serialDescriptorArr = (SerialDescriptor[]) list.toArray(new SerialDescriptor[0])) == null) ? b : serialDescriptorArr;
    }

    public static void l(Context context, CharSequence charSequence) {
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(charSequence, charSequence));
    }

    public static final ViewParent m(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final void n() {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(151109300, 0, -1, "com.vk.core.compose.component.defaults.<get-VkCellDefaults> (VkCellDefaults.kt:160)");
        }
        com.vk.core.compose.component.defaults.c cVar = com.vk.core.compose.component.defaults.c.a;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
    }

    public static final void o(int i, View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 == null) {
            return;
        }
        view2.post(new ebq(view, view2, i));
    }

    public static final boolean p(StoryEntry storyEntry, UserId userId) {
        if (!storyEntry.i0) {
            return false;
        }
        if (epx.f(storyEntry.d, userId)) {
            return true;
        }
        if (storyEntry.i >= 100 || storyEntry.j0 >= 3) {
            return false;
        }
        return storyEntry.k0 == 0 || (System.currentTimeMillis() / ((long) 1000)) - storyEntry.k0 < 300;
    }

    public static final dcy q(vcy vcyVar) {
        dcy k = vcyVar.k();
        if (k instanceof dcy) {
            return k;
        }
        throw new IllegalArgumentException("Only KClass supported as classifier, got " + k);
    }

    public static long r(UserId userId) {
        return userId.b;
    }

    public static Image s(List list) {
        List<BaseImageDto> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (BaseImageDto baseImageDto : list2) {
            arrayList.add(new ImageSize(baseImageDto.getUrl(), baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.e(), (char) 0, false, 48, null));
        }
        return new Image(arrayList);
    }

    public static LinkedHashMap t(Post post) {
        UserId userId;
        String str;
        UserId userId2;
        Owner owner;
        Owner owner2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Owner owner3 = post.o;
        UserId userId3 = owner3.b;
        String str2 = owner3.c;
        if (str2 == null) {
            if (fkq0.d(userId3)) {
                str2 = b4q.b(userId3, "id");
            } else {
                str2 = "club" + fkq0.a(userId3);
            }
        }
        linkedHashMap.put(userId3, str2);
        Caption caption = post.x;
        if (caption != null) {
            userId2 = caption.h;
            str = caption.j;
        } else {
            Post post2 = post.D;
            if (post2 == null || (owner2 = post2.o) == null || (userId = owner2.b) == null) {
                userId = UserId.d;
            }
            UserId userId4 = userId;
            str = (post2 == null || (owner = post2.o) == null) ? null : owner.c;
            userId2 = userId4;
        }
        if (fkq0.c(userId2)) {
            if (str == null) {
                if (fkq0.d(userId2)) {
                    str = b4q.b(userId2, "id");
                } else {
                    str = "club" + fkq0.a(userId2);
                }
            }
            linkedHashMap.put(userId2, str);
        }
        return linkedHashMap;
    }

    public static final q630 u(q630 q630Var, izs izsVar) {
        return q630Var.g(new evr(izsVar));
    }

    public static boolean v(Context context, String str, boolean z) {
        Context applicationContext = context.getApplicationContext();
        if (drm0.N(str) || str.equals(applicationContext.getPackageName())) {
            return false;
        }
        Intent launchIntentForPackage = applicationContext.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage != null) {
            applicationContext.startActivity(launchIntentForPackage);
            return true;
        }
        if (!z) {
            return false;
        }
        Context applicationContext2 = applicationContext.getApplicationContext();
        try {
            try {
                applicationContext2.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("market://details?id=".concat(str))).addFlags(268435456));
            } catch (ActivityNotFoundException unused) {
                applicationContext2.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("http://play.google.com/store/apps/details?id=".concat(str))).addFlags(268435456));
            }
            return true;
        } catch (ActivityNotFoundException unused2) {
            return false;
        }
    }

    public static final void w(dcy dcyVar) {
        String l = dcyVar.l();
        if (l == null) {
            l = "<local class name not available>";
        }
        throw new SerializationException(zr.a("Serializer for class '", l, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }

    public static final void x(Window window, boolean z) {
        if (gz80.a(23)) {
            if (z) {
                window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 8192);
            } else {
                window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() & (-8193));
            }
        }
    }

    public static final void y(View view, ViewGroup viewGroup) {
        view.setTag(R.id.view_tree_disjoint_parent, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static bgm0 z(String str) {
        dgm0 dgm0Var;
        String str2 = null;
        Object[] objArr = 0;
        if (str == null || drm0.N(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        JSONObject optJSONObject = jSONObject.optJSONObject(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
        int i = jSONObject.getInt("questionId");
        String optString = jSONObject.optString("ownerId");
        UserId userId = optString != null ? new UserId(Long.parseLong(optString)) : null;
        String string = jSONObject.getString("question");
        boolean z = jSONObject.getBoolean("isAnonymous");
        boolean z2 = jSONObject.getBoolean("isOwnerBlocker");
        if (optJSONObject != null) {
            UserId userId2 = new UserId(optJSONObject.optLong("uid"));
            String string2 = optJSONObject.getString("fullName");
            String string3 = optJSONObject.getString("firstName");
            JSONArray optJSONArray = optJSONObject.optJSONArray("image");
            dgm0Var = new dgm0(userId2, string2, string3, optJSONArray != null ? new Image(optJSONArray, str2, 2, objArr == true ? 1 : 0) : null, optJSONObject.getString("photo"), optJSONObject.getBoolean("canMessage"), optJSONObject.optString("firstNameGen"), optJSONObject.optString("fullNameAcc"));
        } else {
            dgm0Var = null;
        }
        return new bgm0(i, userId, string, z, z2, dgm0Var, jSONObject.getBoolean("isPublished"), jSONObject.getBoolean("withMention"), jSONObject.getInt("date"));
    }

    @Override // xsna.l100
    public void a(String str) {
        L.e("ViewPoolProvider", str);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (Boolean) obj2;
    }

    @Override // xsna.l100
    public void c(RuntimeException runtimeException) {
        if (runtimeException.getCause() instanceof InterruptedException) {
            L.e(runtimeException, "ViewPoolProvider");
        } else {
            com.vk.metrics.eventtracking.b.a.q(runtimeException);
        }
    }

    @Override // xsna.o320
    public String d(i420 i420Var, String str) {
        if (i420Var instanceof b9z) {
            return super.h((b9z) i420Var, str);
        }
        String str2 = "";
        if (!(i420Var instanceof ogq0)) {
            return "";
        }
        StringBuilder sb = new StringBuilder(X3.j.d);
        UserId userId = ((ogq0) i420Var).b;
        sb.append(fkq0.b(userId) ? "club" : "id");
        sb.append(Math.abs(userId.b));
        if (i420Var instanceof fi7) {
            StringBuilder sb2 = new StringBuilder(":bp");
            fi7 fi7Var = (fi7) i420Var;
            sb2.append(fi7Var.f);
            sb2.append('_');
            sb2.append(fi7Var.e);
            str2 = sb2.toString();
        }
        sb.append(str2);
        sb.append('|');
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }

    @Override // xsna.tan0
    public r7n0 e(qen0 qen0Var, qan0 qan0Var, dpx0 dpx0Var, uww0 uww0Var, com.vk.movika.sdk.base.flow.binding.l lVar, yde ydeVar, boolean z) {
        return new jgz(23);
    }

    @Override // xsna.tan0
    public void b() {
    }
}
