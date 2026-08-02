package xsna;

import android.app.Application;
import android.app.Dialog;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.fave.entities.FaveEntry;
import com.vk.stickers.bottomsheets.LegoStickersBottomSheetDialog;
import com.vkontakte.android.R;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Triple;

/* compiled from: ClipsHostFragmentWindowProvider.kt */
/* loaded from: classes17.dex */
public final class vfe implements ege, jgp0, is8, fn50, a780 {
    public final Object b;

    public /* synthetic */ vfe(Object obj) {
        this.b = obj;
    }

    @Override // xsna.a780
    public void a() {
        ((fii0) this.b).c();
    }

    @Override // xsna.fn50
    public izs b() {
        return (izs) this.b;
    }

    @Override // xsna.is8
    public void c() {
        LegoStickersBottomSheetDialog legoStickersBottomSheetDialog = (LegoStickersBottomSheetDialog) this.b;
        int i = LegoStickersBottomSheetDialog.d0;
        legoStickersBottomSheetDialog.fo();
    }

    @Override // xsna.ege
    public Window getWindow() {
        Dialog dialog;
        Window window;
        ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) this.b;
        Dialog dialog2 = clipsWrapperFragment.s;
        Window window2 = null;
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            if (!clipsWrapperFragment.o) {
                window = null;
            }
            if (window != null) {
                return window;
            }
        }
        Fragment parentFragment = clipsWrapperFragment.getParentFragment();
        androidx.fragment.app.d dVar = parentFragment instanceof androidx.fragment.app.d ? (androidx.fragment.app.d) parentFragment : null;
        if (dVar != null) {
            if (!dVar.o) {
                dVar = null;
            }
            if (dVar != null && (dialog = dVar.s) != null) {
                window2 = dialog.getWindow();
            }
        }
        return window2 == null ? clipsWrapperFragment.kn().getWindow() : window2;
    }

    @Override // xsna.jgp0
    public String i(androidx.media3.common.a aVar) {
        String j;
        Resources resources = (Resources) this.b;
        String str = aVar.n;
        int i = aVar.j;
        int i2 = aVar.F;
        int i3 = aVar.v;
        int i4 = aVar.u;
        String str2 = aVar.k;
        int i5 = io20.i(str);
        if (i5 == -1) {
            if (io20.k(str2) == null) {
                if (io20.b(str2) == null) {
                    if (i4 == -1 && i3 == -1) {
                        if (i2 == -1 && aVar.G == -1) {
                            i5 = -1;
                        }
                    }
                }
                i5 = 1;
            }
            i5 = 2;
        }
        if (i5 == 2) {
            j = n(k(aVar), (i4 == -1 || i3 == -1) ? "" : resources.getString(R.string.exo_track_resolution, Integer.valueOf(i4), Integer.valueOf(i3)), i != -1 ? resources.getString(R.string.exo_track_bitrate, Float.valueOf(i / 1000000.0f)) : "");
        } else if (i5 == 1) {
            j = n(j(aVar), (i2 == -1 || i2 < 1) ? "" : i2 != 1 ? i2 != 2 ? (i2 == 6 || i2 == 7) ? resources.getString(R.string.exo_track_surround_5_point_1) : i2 != 8 ? resources.getString(R.string.exo_track_surround) : resources.getString(R.string.exo_track_surround_7_point_1) : resources.getString(R.string.exo_track_stereo) : resources.getString(R.string.exo_track_mono), i != -1 ? resources.getString(R.string.exo_track_bitrate, Float.valueOf(i / 1000000.0f)) : "");
        } else {
            j = j(aVar);
        }
        if (!j.isEmpty()) {
            return j;
        }
        String str3 = aVar.d;
        return (str3 == null || str3.trim().isEmpty()) ? resources.getString(R.string.exo_track_unknown) : resources.getString(R.string.exo_track_unknown_name, str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String j(androidx.media3.common.a aVar) {
        String str;
        String n;
        String str2 = aVar.d;
        String str3 = aVar.b;
        if (!TextUtils.isEmpty(str2) && !C.LANGUAGE_UNDETERMINED.equals(str2)) {
            Locale forLanguageTag = Locale.forLanguageTag(str2);
            String str4 = y2r0.a;
            Locale locale = Locale.getDefault(Locale.Category.DISPLAY);
            str = forLanguageTag.getDisplayName(locale);
            if (!TextUtils.isEmpty(str)) {
                try {
                    int offsetByCodePoints = str.offsetByCodePoints(0, 1);
                    str = str.substring(0, offsetByCodePoints).toUpperCase(locale) + str.substring(offsetByCodePoints);
                } catch (IndexOutOfBoundsException unused) {
                }
                n = n(str, k(aVar));
                if (TextUtils.isEmpty(n)) {
                    return n;
                }
                if (TextUtils.isEmpty(str3)) {
                    str3 = "";
                }
                return str3;
            }
        }
        str = "";
        n = n(str, k(aVar));
        if (TextUtils.isEmpty(n)) {
        }
    }

    public String k(androidx.media3.common.a aVar) {
        Resources resources = (Resources) this.b;
        int i = aVar.f;
        int i2 = aVar.f;
        String string = (i & 2) != 0 ? resources.getString(R.string.exo_track_role_alternate) : "";
        if ((i2 & 4) != 0) {
            string = n(string, resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((i2 & 8) != 0) {
            string = n(string, resources.getString(R.string.exo_track_role_commentary));
        }
        return (i2 & 1088) != 0 ? n(string, resources.getString(R.string.exo_track_role_closed_captions)) : string;
    }

    public boolean l(String str) {
        return anj.a((Application) this.b, str) == 0;
    }

    public u1c0 m(FaveEntry faveEntry, s1c0 s1c0Var) {
        u1c0 u1c0Var = new u1c0(1, faveEntry);
        h170 h170Var = (h170) this.b;
        u1c0Var.h = (ol60) j5g.a0(new pwc(h170Var, new pa2(h170Var)).m(0, new Triple(faveEntry, faveEntry, s1c0Var)));
        return u1c0Var;
    }

    public String n(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (!str2.isEmpty()) {
                str = TextUtils.isEmpty(str) ? str2 : ((Resources) this.b).getString(R.string.exo_item_list, str, str2);
            }
        }
        return str;
    }

    public vfe(Resources resources) {
        resources.getClass();
        this.b = resources;
    }

    public vfe(int i) {
        switch (i) {
            case 9:
                this.b = new SparseArray(2);
                break;
            case 10:
                this.b = new ConcurrentHashMap();
                break;
            default:
                this.b = new zqu();
                break;
        }
    }

    @Override // xsna.a780
    public void onSuccess() {
    }
}
