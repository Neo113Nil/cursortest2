package xsna;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.google.android.gms.internal.measurement.zznn;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.core.compose.theme.VkAppTheme;
import com.vk.core.preference.Preference;
import com.vk.core.serialize.Serializer;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.dto.clips.music.ClipsEditorMusicTrack;
import com.vk.dto.clips.music.MusicCatalogInfoEditor;
import com.vk.dto.common.id.UserId;
import com.vk.geo.impl.model.Coordinate;
import com.vk.log.L;
import com.vk.permission.PermissionHelper;
import com.vk.superapp.api.dto.story.WebClickablePoint;
import com.vk.superapp.api.dto.story.WebClickableZone;
import com.vk.superapp.api.dto.story.WebNativeSticker;
import com.vk.superapp.api.dto.story.WebRenderableSticker;
import com.vk.superapp.api.dto.story.WebSticker;
import com.vk.superapp.api.dto.story.WebStickerType;
import com.vk.superapp.api.dto.story.WebTransform;
import com.vk.superapp.api.dto.story.actions.StickerAction;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AuthGetCredentialsForServiceMultiMappers.kt */
/* loaded from: classes6.dex */
public final class i35 implements axp, bwz0, q701, vtq {
    public static final jai b;
    public static final i35 c;
    public static volatile long d = -1;
    public static final i35 e;
    public static final i35 f;
    public static final /* synthetic */ i35 g;
    public static final /* synthetic */ i35 h;

    static {
        new jai(90677708, new x7c(4), false);
        b = new jai(1030823639, new pv7((byte) 0, 4), false);
        c = new i35();
        e = new i35();
        f = new i35();
        g = new i35();
        h = new i35();
    }

    public static final ColorStateList c(CompoundButton compoundButton) {
        return new ColorStateList(new int[][]{new int[]{-16842912, -16842910}, new int[]{R.attr.state_checked, -16842910}, new int[]{-16842912}, new int[]{R.attr.state_checked}}, new int[]{l8g.f(0.64f, gpo0.d(com.vkontakte.android.R.attr.vk_ui_icon_tertiary, compoundButton)), l8g.f(0.64f, gpo0.d(com.vkontakte.android.R.attr.vk_ui_icon_tertiary, compoundButton)), gpo0.d(com.vkontakte.android.R.attr.vk_ui_icon_tertiary, compoundButton), gpo0.d(com.vkontakte.android.R.attr.vk_ui_icon_accent, compoundButton)});
    }

    public static alp d(alp alpVar, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = alpVar.a;
        }
        if ((i & 2) != 0) {
            z2 = alpVar.b;
        }
        return (z == alpVar.a && z2 == alpVar.b) ? alpVar : new alp(z, z2);
    }

    public static VkAppTheme f(boolean z) {
        boolean booleanValue = bqi.a().getValue().booleanValue();
        return (z || !booleanValue) ? !z ? VkAppTheme.VkontakteAndroid : booleanValue ? VkAppTheme.LegoAndroidDark : VkAppTheme.LegoAndroid : VkAppTheme.VkontakteAndroidDark;
    }

    public static final gn20 g() {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1014480628, 0, -1, "com.vk.core.compose.component.defaults.<get-VkCheckboxDefaults> (VkCheckboxDefaults.kt:79)");
        }
        gn20 gn20Var = gn20.f;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return gn20Var;
    }

    public static final boolean h(long j) {
        m6r0 f2 = q6r0.f();
        return (com.vk.dto.common.b.d(j) && !Objects.equals(q6r0.f().y(), new UserId(j)) && f2.e(m6r0.F)) || (com.vk.dto.common.b.c(j) && f2.e(m6r0.H));
    }

    public static WebSticker j(JSONObject jSONObject) {
        WebTransform webTransform;
        WebTransform webTransform2;
        List list;
        List list2;
        JSONArray jSONArray;
        int i;
        ArrayList arrayList;
        int i2;
        String string = jSONObject.getString("sticker_type");
        JSONObject jSONObject2 = jSONObject.getJSONObject("sticker");
        boolean f2 = epx.f(string, "renderable");
        com.vk.superapp.api.dto.story.actions.a aVar = com.vk.superapp.api.dto.story.actions.a.a;
        boolean z = true;
        if (!f2) {
            if (!epx.f(string, "native")) {
                throw new JSONException(zr.a("sticker type ", string, " not supported"));
            }
            Serializer.c<WebNativeSticker> cVar = WebNativeSticker.CREATOR;
            String string2 = jSONObject2.getString("action_type");
            StickerAction a = aVar.a(jSONObject2);
            JSONObject optJSONObject = jSONObject2.optJSONObject("transform");
            if (optJSONObject != null) {
                Serializer.c<WebTransform> cVar2 = WebTransform.CREATOR;
                webTransform = WebTransform.a.a(optJSONObject);
            } else {
                webTransform = new WebTransform(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 31, null);
            }
            return new WebNativeSticker(string2, a, webTransform, jSONObject2.optBoolean("can_delete", true), jSONObject2.optBoolean("is_static", false));
        }
        Serializer.c<WebRenderableSticker> cVar3 = WebRenderableSticker.CREATOR;
        String string3 = jSONObject2.getString("content_type");
        String A = f370.A("url", jSONObject2);
        String A2 = f370.A("blob", jSONObject2);
        JSONObject optJSONObject2 = jSONObject2.optJSONObject("transform");
        if (optJSONObject2 != null) {
            Serializer.c<WebTransform> cVar4 = WebTransform.CREATOR;
            webTransform2 = WebTransform.a.a(optJSONObject2);
        } else {
            webTransform2 = new WebTransform(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 31, null);
        }
        JSONArray optJSONArray = jSONObject2.optJSONArray("clickable_zones");
        if (optJSONArray != null) {
            ArrayList arrayList2 = new ArrayList(optJSONArray.length());
            int length = optJSONArray.length();
            int i3 = 0;
            while (i3 < length) {
                JSONObject optJSONObject3 = optJSONArray.optJSONObject(i3);
                if (optJSONObject3 != null) {
                    Serializer.c<WebClickableZone> cVar5 = WebClickableZone.CREATOR;
                    String string4 = optJSONObject3.getString("action_type");
                    WebStickerType.Companion.getClass();
                    WebStickerType a2 = WebStickerType.a.a(string4);
                    if (a2 == null || a2.j() != z) {
                        throw new JSONException("Not supported action for clickable zone ".concat(string4));
                    }
                    StickerAction a3 = aVar.a(optJSONObject3);
                    JSONArray optJSONArray2 = optJSONObject3.optJSONArray("clickable_area");
                    if (optJSONArray2 != null) {
                        jSONArray = optJSONArray;
                        arrayList = new ArrayList(optJSONArray2.length());
                        int length2 = optJSONArray2.length();
                        i = length;
                        int i4 = 0;
                        while (i4 < length2) {
                            JSONObject optJSONObject4 = optJSONArray2.optJSONObject(i4);
                            if (optJSONObject4 != null) {
                                Serializer.c<WebClickablePoint> cVar6 = WebClickablePoint.CREATOR;
                                i2 = length2;
                                arrayList.add(WebClickablePoint.a.a(optJSONObject4));
                            } else {
                                i2 = length2;
                            }
                            i4++;
                            length2 = i2;
                        }
                    } else {
                        jSONArray = optJSONArray;
                        i = length;
                        arrayList = null;
                    }
                    arrayList2.add(new WebClickableZone(string4, a3, arrayList));
                } else {
                    jSONArray = optJSONArray;
                    i = length;
                }
                i3++;
                optJSONArray = jSONArray;
                length = i;
                z = true;
            }
            list = j5g.V(arrayList2);
        } else {
            list = null;
        }
        if (!rl3.G(new String[]{"image", "gif"}, string3)) {
            throw new JSONException(go9.b("Not supported content_type ", string3));
        }
        boolean optBoolean = jSONObject2.optBoolean("can_delete", true);
        boolean optBoolean2 = jSONObject2.optBoolean("locked", false);
        int optInt = jSONObject2.optInt("original_width", -1);
        Integer valueOf = optInt == -1 ? null : Integer.valueOf(optInt);
        int optInt2 = jSONObject2.optInt("original_height", -1);
        Integer valueOf2 = optInt2 == -1 ? null : Integer.valueOf(optInt2);
        if (list != null) {
            if (list.isEmpty()) {
                list = null;
            }
            list2 = list;
        } else {
            list2 = null;
        }
        return new WebRenderableSticker(string3, A, A2, webTransform2, list2, valueOf, valueOf2, optBoolean, optBoolean2);
    }

    public static final float k(float f2, int i) {
        return an10.b(f2 * ((int) r5)) / ((float) Math.pow(10.0f, i));
    }

    public static ColorStateList l(ViewGroup viewGroup) {
        viewGroup.getContext();
        viewGroup.getContext();
        int d2 = gpo0.d(com.vkontakte.android.R.attr.vk_ui_icon_accent, viewGroup);
        return new ColorStateList(new int[][]{new int[]{-16842913}, new int[]{R.attr.state_selected}}, new int[]{gpo0.d(com.vkontakte.android.R.attr.vk_ui_icon_accent, viewGroup), d2});
    }

    public static final ClipsEditorMusicInfo m(dtd dtdVar) {
        ClipsEditorMusicTrack clipsEditorMusicTrack;
        MusicCatalogInfoEditor musicCatalogInfoEditor;
        ftd ftdVar = dtdVar.a;
        ClipsEditorMusicTrack clipsEditorMusicTrack2 = new ClipsEditorMusicTrack(ftdVar.a, ftdVar.b, ftdVar.c, ftdVar.d, ftdVar.e, ftdVar.f, ftdVar.g, ftdVar.h, ftdVar.i, ftdVar.j, false, 1024, null);
        String str = dtdVar.b;
        int i = dtdVar.c;
        int i2 = dtdVar.d;
        int i3 = dtdVar.e;
        String str2 = dtdVar.f;
        int i4 = dtdVar.g;
        boolean z = dtdVar.h;
        boolean z2 = dtdVar.i;
        etd etdVar = dtdVar.j;
        if (etdVar != null) {
            clipsEditorMusicTrack = clipsEditorMusicTrack2;
            musicCatalogInfoEditor = new MusicCatalogInfoEditor(etdVar.a, etdVar.b, etdVar.c, etdVar.d, etdVar.e);
        } else {
            clipsEditorMusicTrack = clipsEditorMusicTrack2;
            musicCatalogInfoEditor = null;
        }
        return new ClipsEditorMusicInfo(clipsEditorMusicTrack, str, i, i2, i3, str2, i4, z, z2, musicCatalogInfoEditor, dtdVar.k);
    }

    public static long n(long j) {
        float intBitsToFloat = ((Float.intBitsToFloat((int) (j >> 32)) / 1080.0f) - 0.5f) * 360.0f;
        float w = ((float) 90.0d) - sdi.w((float) (Math.atan(Math.exp(((-(0.5f - (Float.intBitsToFloat((int) (j & 4294967295L)) / 1080.0f))) * 2) * 3.141592653589793d)) * 2));
        Parcelable.Creator<Coordinate> creator = Coordinate.CREATOR;
        return gqr.a(w, intBitsToFloat);
    }

    public static long o(float f2, float f3) {
        float sin = (float) Math.sin(sdi.x(f3));
        return gqr.a(((f2 / 360.0f) + 0.5f) * 1080.0f, uq.a((float) Math.log((sin + 1.0f) / (1.0f - sin)), 0.5f, -6.2831855f, 0.5f) * 1080.0f);
    }

    @Override // xsna.vtq
    public void a(Throwable th) {
        L.e("FcmDebugLogger", ms9.b("throwable ", th));
    }

    @Override // xsna.bwz0
    public String b(String str, String str2) {
        return null;
    }

    public synchronized int e() {
        int i;
        try {
            if (d == -1) {
                d = Preference.m(0L, "notifications_prefs", "notifications_unique_id");
            }
            if (d == 0) {
                d++;
            }
            i = (int) d;
            d++;
            Preference.F(d, "notifications_prefs", "notifications_unique_id");
        } catch (Throwable th) {
            throw th;
        }
        return i;
    }

    public void i(Context context, Uri uri) {
        String scheme = uri.getScheme();
        String lastPathSegment = uri.getLastPathSegment();
        if (scheme == null || !(scheme.equals("http") || scheme.equals(HttpRequest.DEFAULT_SCHEME))) {
            vao.g(context, uri.toString());
            return;
        }
        if (vao.j(context, uri, true)) {
            return;
        }
        grb grbVar = new grb(context, lastPathSegment, uri, 8);
        if (gz80.a(34)) {
            grbVar.invoke();
            return;
        }
        PermissionHelper permissionHelper = PermissionHelper.a;
        permissionHelper.getClass();
        permissionHelper.d(context, PermissionHelper.e, com.vkontakte.android.R.string.vk_permissions_storage, com.vkontakte.android.R.string.vk_permissions_storage, grbVar, null);
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Integer.valueOf((int) zznn.zzi());
    }
}
