package xsna;

import com.vk.dto.common.DialogBackground;
import com.vk.im.engine.models.dialogs.DialogTheme;
import com.vk.im.engine.models.dialogs.c;
import com.vk.log.L;
import com.vk.toggle.features.ImFeatures;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.pkm;

/* compiled from: DialogThemeStorageImpl.kt */
/* loaded from: classes2.dex */
public final class flm implements elm {
    public static final List<String> k = e43.l("warm_valentine", "halloween_orange", "halloween_violet", "new_year", "frost");
    public final Iterable<plm> a;
    public final a67 b;
    public final cil0<DialogTheme> c;
    public final pkm d;
    public Object e;
    public final bpn0 f;
    public final bpn0 g;
    public final bpn0 h;
    public final bpn0 i;
    public final a j;

    /* compiled from: DialogThemeStorageImpl.kt */
    public static final class a {
        public final mey a;

        public a(mey meyVar) {
            this.a = meyVar;
        }
    }

    public flm(tgl0 tgl0Var, Iterable iterable, a67 a67Var) {
        int i;
        this.a = iterable;
        this.b = a67Var;
        this.c = tgl0Var.c(DialogTheme.class);
        pkm pkmVar = new pkm(tgl0Var);
        this.d = pkmVar;
        this.e = jgp.b;
        this.f = new bpn0(new tbg(this, 14));
        this.g = new bpn0(new m3g(this, 10));
        this.h = new bpn0(new bfm(tgl0Var, 1));
        this.i = new bpn0(new qfj(tgl0Var, 1));
        this.j = new a(tgl0Var.a());
        rey k2 = tgl0Var.I0().k();
        mey a2 = tgl0Var.a();
        int i2 = 0;
        if (!a2.getBoolean("is_migrated", false)) {
            String string = k2.getString("custom_theme_based_on");
            if (string != null) {
                a2.putString("custom_theme_based_on", string);
                k2.delete("custom_theme_based_on");
            }
            String string2 = k2.getString("custom_theme_background");
            if (string2 != null) {
                a2.putString("custom_theme_background", string2);
                k2.delete("custom_theme_background");
            }
            a2.putBoolean("is_migrated", true);
        }
        mey a3 = tgl0Var.a();
        if (!a3.getBoolean(fto0.w("with_user_id_is_migrated"), false)) {
            String string3 = a3.getString("custom_theme_based_on");
            if (string3 != null) {
                a3.putString(fto0.w("custom_theme_based_on"), string3);
                a3.delete("custom_theme_based_on");
            }
            String string4 = a3.getString("custom_theme_background");
            if (string4 != null) {
                a3.putString(fto0.w("custom_theme_background"), string4);
                a3.delete("custom_theme_background");
            }
            a3.putBoolean(fto0.w("with_user_id_is_migrated"), true);
        }
        int i3 = tgl0Var.a().getInt("dialog_theme_storage_version", 0);
        while (i3 < pkmVar.c) {
            pkm pkmVar2 = this.d;
            if (i3 == 1) {
                e0w b = pkmVar2.b.b();
                StringBuilder sb = new StringBuilder("SELECT ");
                sgl0 sgl0Var = pkmVar2.a;
                sb.append(sgl0Var.c());
                sb.append(" FROM ");
                sb.append(sgl0Var.a);
                sb.append(" ORDER BY ");
                sb.append(pkm.a.SORT.getKey());
                sb.append(" ASC");
                Collection values = pkm.a(b.d(sb.toString(), null)).values();
                ArrayList arrayList = new ArrayList(c5g.u(values, 10));
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    okm okmVar = (okm) it.next();
                    String str = okmVar.a;
                    if (epx.f(str, c.g.c.a)) {
                        i = i2;
                    } else if (epx.f(str, c.h.c.a)) {
                        i = 1;
                    } else {
                        i = epx.f(str, c.C1124c.c.a) ? 2 : epx.f(str, "vk17") ? 3 : Integer.MAX_VALUE;
                    }
                    arrayList.add(new okm(i, okmVar.a, okmVar.f, okmVar.g, okmVar.b, okmVar.c, okmVar.e));
                    it = it;
                    i2 = 0;
                }
                pkmVar2.b.b().h(new m9(14, pkmVar2, arrayList));
            }
            i3++;
            tgl0Var.a().putInt("dialog_theme_storage_version", i3);
            i2 = 0;
        }
    }

    @Override // xsna.elm
    public final String a(String str) {
        Object obj;
        com.vk.im.engine.models.dialogs.c cVar;
        String str2;
        if (str.equals(c.h.c.a) && (str = this.j.a.getString(fto0.w("custom_theme_based_on"))) == null) {
            str = c.C1124c.c.a;
        }
        Iterator it = m().values().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((DialogTheme) obj).b.a, str)) {
                break;
            }
        }
        DialogTheme dialogTheme = (DialogTheme) obj;
        if (dialogTheme != null && (cVar = dialogTheme.b) != null && (str2 = cVar.a) != null) {
            return str2;
        }
        okm b = this.d.b(str);
        if (b != null) {
            return b.f;
        }
        return null;
    }

    @Override // xsna.elm
    public final DialogTheme b(String str) {
        CopyOnWriteArraySet copyOnWriteArraySet = com.vk.im.engine.models.dialogs.c.b;
        return e(c.a.a(str));
    }

    @Override // xsna.elm
    public final boolean c(com.vk.im.engine.models.dialogs.c cVar) {
        return m().get(cVar) != null;
    }

    @Override // xsna.elm
    public final boolean d(String str) {
        String a2 = a(str);
        return (a2 == null || ((z9m) this.i.getValue()).e(a2) == null) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    @Override // xsna.elm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DialogTheme e(com.vk.im.engine.models.dialogs.c cVar) {
        okm b;
        Pair a2;
        plm plmVar = (plm) this.g.getValue();
        Map<String, String> g = g();
        String str = cVar.a;
        String str2 = g.get(str);
        MapBuilder n = n();
        DialogTheme dialogTheme = (DialogTheme) n.get(cVar);
        if (dialogTheme == null) {
            pkm pkmVar = this.d;
            okm b2 = pkmVar.b(str);
            if (b2 != null) {
                z9m z9mVar = (z9m) this.i.getValue();
                String str3 = b2.f;
                if (str3 == null) {
                    str3 = "";
                }
                x9m e = z9mVar.e(str3);
                ram ramVar = (ram) this.h.getValue();
                String str4 = b2.g;
                lam e2 = ramVar.e(str4 != null ? str4 : "");
                if (e != null && plmVar != null && (b = pkmVar.b(str)) != null && (a2 = ilm.a(b, plmVar, e2, e, str2)) != null) {
                    dialogTheme = (DialogTheme) a2.j();
                    if (dialogTheme == null) {
                        dialogTheme = (DialogTheme) n.get(c.C1124c.c);
                    }
                }
            }
            dialogTheme = null;
            if (dialogTheme == null) {
            }
        }
        if (dialogTheme != null) {
            return DialogTheme.zb(dialogTheme, null, null, null, str2, 7);
        }
        return null;
    }

    @Override // xsna.elm
    public final boolean f(String str) {
        String i = i(str);
        if (i == null) {
            return false;
        }
        return ((ram) this.h.getValue()).j(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.Map<java.lang.String, java.lang.String>] */
    @Override // xsna.elm
    public final Map<String, String> g() {
        ?? r0 = this.e;
        if (!r0.isEmpty()) {
            return r0;
        }
        bpn0 bpn0Var = hpo0.a;
        String str = (String) this.b.invoke();
        File c = hpo0.c((str == null || drm0.N(str)) ? "theme_lang_file_cache" : "theme_lang_file_cache_".concat(str));
        try {
            if (c.exists()) {
                this.e = f370.M(new JSONObject(new String(nbr.p(c), emb.b)));
            }
        } catch (IOException e) {
            L.i(e);
        } catch (IllegalArgumentException e2) {
            L.i(e2);
            hpo0.h(c);
        } catch (JSONException e3) {
            L.i(e3);
            hpo0.h(c);
        }
        return this.e;
    }

    @Override // xsna.elm
    public final ArrayList getAll() {
        Pair a2;
        Map<String, String> g = g();
        Collection values = n().values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            List<String> list = az9.f;
            com.vk.im.engine.models.dialogs.c cVar = ((DialogTheme) obj).b;
            if (!list.contains(cVar.a) && !k.contains(cVar.a)) {
                Set<String> set = dlm.a;
                if (!dlm.a.contains(cVar.a.toLowerCase(Locale.ROOT))) {
                    arrayList.add(obj);
                }
            }
        }
        List<DialogTheme> D0 = j5g.D0(new glm(0), arrayList);
        ArrayList arrayList2 = new ArrayList(c5g.u(D0, 10));
        for (DialogTheme dialogTheme : D0) {
            arrayList2.add(DialogTheme.zb(dialogTheme, null, null, null, g.get(dialogTheme.b.a), 7));
        }
        plm plmVar = (plm) this.g.getValue();
        List<x9m> all = ((z9m) this.i.getValue()).getAll();
        int e = on00.e(c5g.u(all, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (Object obj2 : all) {
            linkedHashMap.put(((x9m) obj2).a, obj2);
        }
        List<lam> all2 = ((ram) this.h.getValue()).getAll();
        int e2 = on00.e(c5g.u(all2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(e2 >= 16 ? e2 : 16);
        for (Object obj3 : all2) {
            linkedHashMap2.put(((lam) obj3).a, obj3);
        }
        pkm pkmVar = this.d;
        e0w b = pkmVar.b.b();
        StringBuilder sb = new StringBuilder("SELECT ");
        sgl0 sgl0Var = pkmVar.a;
        sb.append(sgl0Var.c());
        sb.append(" FROM ");
        sb.append(sgl0Var.a);
        sb.append(" WHERE ");
        sb.append(pkm.a.IS_HIDDEN.getKey());
        sb.append(" = 0");
        List<okm> D02 = j5g.D0(new hlm(), pkm.a(b.d(sb.toString(), null)).values());
        ArrayList arrayList3 = new ArrayList();
        for (okm okmVar : D02) {
            x9m x9mVar = (x9m) linkedHashMap.get(okmVar.f);
            DialogTheme dialogTheme2 = (x9mVar == null || plmVar == null || (a2 = ilm.a(okmVar, plmVar, (lam) linkedHashMap2.get(okmVar.g), x9mVar, g.get(okmVar.a))) == null) ? null : (DialogTheme) a2.j();
            if (dialogTheme2 != null) {
                arrayList3.add(dialogTheme2);
            }
        }
        return j5g.u0(arrayList3, arrayList2);
    }

    @Override // xsna.elm
    public final long h(String str) {
        okm b = this.d.b(str);
        if (b != null) {
            return b.e;
        }
        return 0L;
    }

    @Override // xsna.elm
    public final String i(String str) {
        Object obj;
        com.vk.im.engine.models.dialogs.c cVar;
        String str2;
        if (str.equals(c.h.c.a)) {
            return this.j.a.getString(fto0.w("custom_theme_background"));
        }
        Iterator it = m().values().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((DialogTheme) obj).b.a, str)) {
                break;
            }
        }
        DialogTheme dialogTheme = (DialogTheme) obj;
        if (dialogTheme != null && (cVar = dialogTheme.b) != null && (str2 = cVar.a) != null) {
            return str2;
        }
        okm b = this.d.b(str);
        if (b != null) {
            return b.g;
        }
        return null;
    }

    @Override // xsna.elm
    public final void j(okm okmVar) {
        pkm pkmVar = this.d;
        pkmVar.getClass();
        pkmVar.b.b().h(new m9(14, pkmVar, Collections.singletonList(okmVar)));
    }

    @Override // xsna.elm
    public final void k(String str, LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(g());
        linkedHashMap2.putAll(linkedHashMap);
        bpn0 bpn0Var = hpo0.a;
        File c = hpo0.c(drm0.N(str) ? "theme_lang_file_cache" : "theme_lang_file_cache_".concat(str));
        try {
            nbr.w(c, new JSONObject(linkedHashMap).toString(), emb.b);
            this.e = linkedHashMap2;
        } catch (IOException e) {
            L.E(e, new Object[0]);
            hpo0.h(c);
        } catch (JSONException e2) {
            L.i(e2);
        }
    }

    @Override // xsna.elm
    public final void l(DialogTheme dialogTheme, DialogTheme dialogTheme2, String str) {
        com.vk.im.engine.models.dialogs.c cVar = dialogTheme.b;
        mey meyVar = this.j.a;
        com.vk.im.engine.models.dialogs.c cVar2 = dialogTheme2.b;
        ImFeatures imFeatures = ImFeatures.BACKGROUND_LOSS_FIX;
        imFeatures.getClass();
        if (!com.vk.toggle.b.A.a(imFeatures)) {
            if (!epx.f(cVar2.a, c.h.c.a)) {
                meyVar.delete(fto0.w("custom_theme_based_on"));
            }
            meyVar.delete(fto0.w("custom_theme_background"));
        }
        if (!epx.f(cVar2.a, c.h.c.a)) {
            meyVar.putString(fto0.w("custom_theme_based_on"), cVar2.a);
        }
        meyVar.putString(fto0.w("custom_theme_background"), str);
        DialogTheme dialogTheme3 = (DialogTheme) m().get(cVar);
        m().put(cVar, dialogTheme);
        cil0<DialogTheme> cil0Var = this.c;
        if (cil0Var != null) {
            cil0Var.b(dialogTheme3, dialogTheme);
        }
    }

    public final LinkedHashMap m() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        bpn0 bpn0Var = this.f;
        linkedHashMap.putAll((Map) bpn0Var.getValue());
        Map map = (Map) bpn0Var.getValue();
        a aVar = this.j;
        mey meyVar = aVar.a;
        mey meyVar2 = aVar.a;
        String string = meyVar.getString(fto0.w("custom_theme_based_on"));
        if (string == null) {
            string = "";
        }
        DialogTheme dialogTheme = null;
        if (!drm0.N(string)) {
            String string2 = meyVar2.getString(fto0.w("custom_theme_background"));
            if (string2 == null) {
                string2 = "";
            }
            lam e = ((ram) this.h.getValue()).e(string2);
            CopyOnWriteArraySet copyOnWriteArraySet = com.vk.im.engine.models.dialogs.c.b;
            DialogTheme dialogTheme2 = (DialogTheme) map.get(c.a.a(string));
            if (dialogTheme2 != null) {
                String string3 = meyVar2.getString(fto0.w("custom_theme_based_on"));
                if (!(string3 == null || drm0.N(string3))) {
                    dialogTheme = DialogTheme.zb(dialogTheme2, c.h.c, hpo0.j(e), null, null, 12);
                }
            } else {
                plm plmVar = (plm) this.g.getValue();
                okm b = this.d.b(string);
                String str = b != null ? b.f : null;
                x9m e2 = ((z9m) this.i.getValue()).e(str != null ? str : "");
                if (e2 != null && plmVar != null) {
                    String string4 = meyVar2.getString(fto0.w("custom_theme_based_on"));
                    if (!(string4 == null || drm0.N(string4))) {
                        DialogBackground j = hpo0.j(e);
                        Pair<com.vk.im.engine.models.dialogs.c, DialogTheme> b2 = plmVar.b(c.h.c.a, ilm.b(e2.c), ilm.b(e2.d));
                        Pair h = b2 != null ? Pair.h(b2, DialogTheme.zb(b2.j(), null, j, null, null, 13)) : null;
                        if (h != null) {
                            dialogTheme = (DialogTheme) h.j();
                        }
                    }
                }
            }
        }
        if (dialogTheme != null) {
            linkedHashMap.put(dialogTheme.b, dialogTheme);
        }
        return linkedHashMap;
    }

    public final MapBuilder n() {
        Map<String, String> g = g();
        MapBuilder mapBuilder = new MapBuilder();
        for (Map.Entry entry : m().entrySet()) {
            com.vk.im.engine.models.dialogs.c cVar = (com.vk.im.engine.models.dialogs.c) entry.getKey();
            DialogTheme dialogTheme = (DialogTheme) entry.getValue();
            com.vk.im.engine.models.dialogs.c cVar2 = dialogTheme.b;
            String str = g.get(cVar2.a);
            if (cVar2.a()) {
                String i = i(cVar2.a);
                if (i == null) {
                    i = "";
                }
                bpn0 bpn0Var = hpo0.a;
                dialogTheme = DialogTheme.zb(dialogTheme, null, hpo0.j(((ram) this.h.getValue()).e(i)), null, str, 5);
            }
            mapBuilder.put(cVar, dialogTheme);
        }
        return mapBuilder.h();
    }
}
