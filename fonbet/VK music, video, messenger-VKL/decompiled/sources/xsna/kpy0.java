package xsna;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import xsna.e0z0;
import xsna.exy0;
import xsna.wty0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class kpy0 implements e0z0.a {
    public final wty0 a;
    public final m1z0 b;
    public m4z0 c;
    public HashMap d;
    public exy0.a e;
    public mau f;
    public final q4z0 g;
    public final l5z0 h;
    public final String i;

    public kpy0(wty0 wty0Var, String str, Context context) {
        this.a = wty0Var;
        this.i = str;
        this.b = new m1z0(context, this);
        this.g = wty0Var.f;
        this.h = wty0Var.g;
    }

    public final ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        wty0 wty0Var = this.a;
        if (wty0Var.c != null) {
            if (this.d == null) {
                this.d = new HashMap();
            }
            this.d.clear();
            for (wty0.a aVar : wty0Var.c) {
                b520 b520Var = aVar.e;
                if (b520Var.b.equalsIgnoreCase(str)) {
                    arrayList.add(b520Var);
                    this.d.put(b520Var, aVar);
                }
            }
        }
        return arrayList;
    }

    public final void b() {
        wty0 wty0Var = this.a;
        List<wty0.a> list = wty0Var.c;
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty()) {
            if (this.d == null) {
                this.d = new HashMap();
            }
            this.d.clear();
            for (wty0.a aVar : list) {
                b520 b520Var = aVar.e;
                String str = b520Var.b;
                if (!str.equalsIgnoreCase("hide") && !str.equalsIgnoreCase("complain")) {
                    this.d.put(b520Var, aVar);
                    arrayList.add(b520Var);
                }
            }
            arrayList.add(new b520("Это не интересно", 0, "self::hide_options", "hide"));
            arrayList.add(new b520("Жалоба", 0, "self::complain_options", "complain"));
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.b.a(this.i, wty0Var.e, null, null, arrayList);
    }

    public final void c(b520 b520Var) {
        exy0.a aVar;
        q4z0 q4z0Var;
        HashMap hashMap = this.d;
        if (hashMap == null) {
            return;
        }
        wty0.a aVar2 = (wty0.a) hashMap.get(b520Var);
        if (aVar2 != null) {
            String str = aVar2.a;
            if (!TextUtils.isEmpty(str)) {
                h8z0.b(str);
            }
        }
        String str2 = b520Var.b;
        boolean equalsIgnoreCase = str2.equalsIgnoreCase("self::hide_options");
        m1z0 m1z0Var = this.b;
        if (equalsIgnoreCase) {
            m1z0Var.getClass();
            this.c = new n5z0(m1z0Var.getContext(), this);
            ArrayList a = a("hide");
            if (!a.isEmpty() && (q4z0Var = this.g) != null) {
                this.c.a(q4z0Var.a, q4z0Var.b, q4z0Var.c, q4z0Var.d, a);
                m1z0Var.dismiss();
            }
        } else {
            boolean equalsIgnoreCase2 = str2.equalsIgnoreCase("self::complain_options");
            l5z0 l5z0Var = this.h;
            if (equalsIgnoreCase2) {
                m1z0Var.getClass();
                this.c = new l6z0(m1z0Var.getContext(), this);
                ArrayList a2 = a("complain");
                if (!a2.isEmpty() && l5z0Var != null) {
                    this.c.a(l5z0Var.a, null, l5z0Var.b, l5z0Var.c, a2);
                    m1z0Var.dismiss();
                }
            } else if (str2.equalsIgnoreCase("copy")) {
                if (this.d != null) {
                    if (aVar2 == null) {
                        return;
                    }
                    String str3 = aVar2.c;
                    if (str3 != null) {
                        m1z0Var.getClass();
                        ((ClipboardManager) m1z0Var.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("copied id", str3));
                    }
                    mau mauVar = this.f;
                    if (mauVar != null) {
                        ((pdz0) mauVar.c).resume();
                    }
                }
            } else if (this.d != null) {
                if (aVar2 == null) {
                    return;
                }
                String str4 = aVar2.b;
                if (!TextUtils.isEmpty(str4)) {
                    m1z0Var.getClass();
                    de.L(str4, null, null, null, m1z0Var.getContext());
                }
                if (aVar2.e.b.equals("complain")) {
                    m1z0Var.getClass();
                    ezy0 ezy0Var = new ezy0(m1z0Var.getContext(), this);
                    if (l5z0Var != null) {
                        ezy0Var.a(l5z0Var.a, l5z0Var.e, l5z0Var.d, l5z0Var.f, null);
                    }
                } else if (aVar2.d && (aVar = this.e) != null) {
                    aVar.b();
                }
                m4z0 m4z0Var = this.c;
                if (m4z0Var != null) {
                    m4z0Var.dismiss();
                }
            }
        }
        m1z0Var.dismiss();
    }
}
