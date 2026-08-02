package xsna;

import android.net.Uri;
import android.os.Bundle;
import com.vk.catalog2.common.dto.api.CatalogCatalog;
import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Keys;
import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Values;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.layout.CatalogLayout;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.text.Regex;
import xsna.m1n;

/* compiled from: ClipDiscoverCatalogBlockInfoRepository.kt */
/* loaded from: classes16.dex */
public final class oqc {
    public final LinkedHashMap a = new LinkedHashMap();
    public final bpn0 b = new bpn0(new com.vk.movika.sdk.base.model.props.c(10));
    public final bpn0 c = new bpn0(new com.vk.movika.sdk.base.model.props.d(11));
    public final bpn0 d = new bpn0(new com.vk.movika.tools.controls.seekbar.n(11));
    public final bpn0 e = new bpn0(new r(7));

    public final void a(CatalogBlock catalogBlock) {
        Uri parse;
        String str = catalogBlock.g;
        String str2 = catalogBlock.b;
        CatalogLayout catalogLayout = catalogBlock.i;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return;
        }
        peq0 peq0Var = new peq0(parse);
        Bundle bundle = catalogLayout.h;
        String str3 = catalogLayout.d;
        boolean f = epx.f(bundle.getString(CatalogCustomAttributes$Keys.STYLE.h()), CatalogCustomAttributes$Values.HIGHLIGHT_TREND.h());
        boolean p = peq0.p(peq0Var, (Regex) this.b.getValue(), null, null, 14);
        LinkedHashMap linkedHashMap = this.a;
        if (p) {
            linkedHashMap.put(str2, new m1n.a(String.valueOf(peq0Var.b(1)), str3));
            return;
        }
        if (peq0.p(peq0Var, (Regex) this.c.getValue(), null, null, 14)) {
            linkedHashMap.put(str2, new m1n.b("#".concat(peq0Var.c.group(1)), f));
        } else if (peq0.p(peq0Var, (Regex) this.d.getValue(), null, null, 14)) {
            linkedHashMap.put(str2, new m1n.d("#".concat(peq0Var.c.group(1)), str3, f));
        } else if (peq0.p(peq0Var, (Regex) this.e.getValue(), null, null, 14)) {
            linkedHashMap.put(str2, new m1n.c("#".concat(peq0Var.c.group(1)), str3));
        }
    }

    public final void b(Object obj) {
        if (obj instanceof CatalogSection) {
            Iterator<T> it = ((CatalogSection) obj).i.iterator();
            while (it.hasNext()) {
                a((CatalogBlock) it.next());
            }
        } else if (!(obj instanceof CatalogCatalog)) {
            if (obj instanceof CatalogBlock) {
                a((CatalogBlock) obj);
            }
        } else {
            Iterator<T> it2 = ((CatalogCatalog) obj).b.iterator();
            while (it2.hasNext()) {
                Iterator<T> it3 = ((CatalogSection) it2.next()).i.iterator();
                while (it3.hasNext()) {
                    a((CatalogBlock) it3.next());
                }
            }
        }
    }
}
