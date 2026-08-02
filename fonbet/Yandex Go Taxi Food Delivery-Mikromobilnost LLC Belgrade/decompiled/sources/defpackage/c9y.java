package defpackage;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes11.dex */
public final class c9y {
    public final /* synthetic */ int a;
    public final SideSheetBehavior b;

    public /* synthetic */ c9y(SideSheetBehavior sideSheetBehavior, int i) {
        this.a = i;
        this.b = sideSheetBehavior;
    }

    public static final long c(KeyEvent keyEvent) {
        return jcb1.a(keyEvent.getKeyCode());
    }

    public static final int f(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final boolean g(KeyEvent keyEvent) {
        return keyEvent.isShiftPressed();
    }

    public static final void h(Bundle bundle, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Integer) {
                bundle.putInt(str, ((Number) value).intValue());
            } else if (value instanceof String) {
                bundle.putString(str, (String) value);
            } else if (value instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) value).booleanValue());
            } else if (value instanceof Double) {
                bundle.putDouble(str, ((Number) value).doubleValue());
            } else if (value instanceof Long) {
                bundle.putLong(str, ((Number) value).longValue());
            } else if (value instanceof Float) {
                bundle.putFloat(str, ((Number) value).floatValue());
            } else if (value instanceof ArrayList) {
                bundle.putStringArrayList(str, (ArrayList) value);
            }
        }
    }

    public final int a() {
        int i = this.a;
        SideSheetBehavior sideSheetBehavior = this.b;
        switch (i) {
            case 0:
                return Math.max(0, sideSheetBehavior.G + sideSheetBehavior.H);
            default:
                return Math.max(0, (sideSheetBehavior.F - sideSheetBehavior.E) - sideSheetBehavior.H);
        }
    }

    public final int b() {
        int i = this.a;
        SideSheetBehavior sideSheetBehavior = this.b;
        switch (i) {
            case 0:
                return (-sideSheetBehavior.E) - sideSheetBehavior.H;
            default:
                return sideSheetBehavior.F;
        }
    }

    public final int d(View view) {
        int i = this.a;
        SideSheetBehavior sideSheetBehavior = this.b;
        switch (i) {
            case 0:
                return view.getRight() + sideSheetBehavior.H;
            default:
                return view.getLeft() - sideSheetBehavior.H;
        }
    }

    public final int e() {
        switch (this.a) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    public final void i(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        switch (this.a) {
            case 0:
                marginLayoutParams.leftMargin = i;
                break;
            default:
                marginLayoutParams.rightMargin = i;
                break;
        }
    }
}
