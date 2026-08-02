package xsna;

import com.vk.dto.common.ImageSizeKey;
import io.opentelemetry.sdk.metrics.InstrumentType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* compiled from: ViewRegistry.java */
/* loaded from: classes8.dex */
public final class k0u0 {
    public static final pn5 c;
    public static final Logger d;
    public final HashMap a = new HashMap();
    public final ArrayList b;

    static {
        p8v a = ttt0.a();
        fo5 fo5Var = new fo5((x71) a.c, (u670) a.d, a.b);
        c = new pn5(new zm5(), fo5Var, u670.c, 2000, f470.INSTANCE);
        d = Logger.getLogger(k0u0.class.getName());
    }

    public k0u0(x9l x9lVar, fu9 fu9Var, ArrayList arrayList) {
        for (InstrumentType instrumentType : InstrumentType.values()) {
            HashMap hashMap = this.a;
            zm5 zm5Var = new zm5();
            p8v a = ttt0.a();
            x71 defaultAggregation = x9lVar.getDefaultAggregation(instrumentType);
            if (!(defaultAggregation instanceof rb1)) {
                throw new IllegalArgumentException("Custom Aggregation implementations are currently not supported. Use one of the standard implementations returned by the static factories in the Aggregation class.");
            }
            a.c = defaultAggregation;
            fo5 fo5Var = new fo5(defaultAggregation, (u670) a.d, a.b);
            fu9Var.getClass();
            hashMap.put(instrumentType, new pn5(zm5Var, fo5Var, u670.c, 2000, f470.INSTANCE));
        }
        this.b = arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ff, code lost:
    
        if ((!r14.equals("*") ? true : r2 != null ? r2.matcher(r3).matches() : r14.equals(r3)) != false) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List a(ym5 ym5Var, q8x q8xVar) {
        Logger logger;
        x41 x41Var;
        Iterator it;
        boolean z;
        Pattern pattern;
        int i;
        Iterator it2;
        char c2;
        x41 x41Var2 = ym5Var.h;
        String str = ym5Var.c;
        InstrumentType instrumentType = ym5Var.f;
        ArrayList arrayList = new ArrayList();
        Iterator it3 = this.b.iterator();
        while (true) {
            boolean hasNext = it3.hasNext();
            logger = d;
            if (!hasNext) {
                break;
            }
            mqf0 mqf0Var = (mqf0) it3.next();
            o8x b = mqf0Var.b();
            if ((b.b() == null || b.b() == instrumentType) && (b.c() == null || b.c().equals(ym5Var.e))) {
                if (b.a() != null) {
                    String a = b.a();
                    int i2 = 0;
                    while (i2 < a.length()) {
                        char charAt = a.charAt(i2);
                        x41Var = x41Var2;
                        char c3 = ImageSizeKey.SIZE_KEY_BASE;
                        if (charAt == '*' || charAt == '?') {
                            StringBuilder sb = new StringBuilder();
                            int i3 = 0;
                            int i4 = -1;
                            while (i3 < a.length()) {
                                char charAt2 = a.charAt(i3);
                                if (charAt2 == c3 || charAt2 == '?') {
                                    i = i4;
                                    it2 = it3;
                                    if (i != -1) {
                                        sb.append(Pattern.quote(a.substring(i, i3)));
                                        i = -1;
                                    }
                                    c2 = ImageSizeKey.SIZE_KEY_BASE;
                                    if (charAt2 == '*') {
                                        sb.append(".*");
                                    } else {
                                        sb.append(".");
                                    }
                                } else {
                                    i = i4;
                                    it2 = it3;
                                    if (i == -1) {
                                        i = i3;
                                    }
                                    c2 = ImageSizeKey.SIZE_KEY_BASE;
                                }
                                i3++;
                                Iterator it4 = it2;
                                i4 = i;
                                c3 = c2;
                                it3 = it4;
                            }
                            int i5 = i4;
                            it = it3;
                            if (i5 != -1) {
                                sb.append(Pattern.quote(a.substring(i5)));
                            }
                            pattern = Pattern.compile(sb.toString());
                        } else {
                            i2++;
                            x41Var2 = x41Var;
                        }
                    }
                    x41Var = x41Var2;
                    it = it3;
                    pattern = null;
                } else {
                    x41Var = x41Var2;
                    it = it3;
                }
                if ((b.d() == null || b.d().equals(q8xVar.c())) && ((b.f() == null || b.f().equals(q8xVar.e())) && (b.e() == null || b.e().equals(q8xVar.d())))) {
                    z = true;
                    if (z) {
                        if (((rb1) mqf0Var.c().b()).b(ym5Var)) {
                            arrayList.add(mqf0Var);
                        } else {
                            logger.log(Level.WARNING, "View aggregation " + ob1.a(mqf0Var.c().b()) + " is incompatible with instrument " + str + " of type " + instrumentType);
                        }
                    }
                    x41Var2 = x41Var;
                    it3 = it;
                }
            } else {
                x41Var = x41Var2;
                it = it3;
            }
            z = false;
            if (z) {
            }
            x41Var2 = x41Var;
            it3 = it;
        }
        x41 x41Var3 = x41Var2;
        if (!arrayList.isEmpty()) {
            return Collections.unmodifiableList(arrayList);
        }
        mqf0 mqf0Var2 = (mqf0) this.a.get(instrumentType);
        Objects.requireNonNull(mqf0Var2);
        if (!((rb1) mqf0Var2.c().b()).b(ym5Var)) {
            logger.log(Level.WARNING, "Instrument default aggregation " + ob1.a(mqf0Var2.c().b()) + " is incompatible with instrument " + str + " of type " + instrumentType);
            mqf0Var2 = c;
        }
        if (x41Var3.a() != null) {
            o8x b2 = mqf0Var2.b();
            ttt0 c4 = mqf0Var2.c();
            List<i94<?>> a2 = x41Var3.a();
            Objects.requireNonNull(a2);
            mqf0Var2 = new pn5(b2, c4, new y41(a2), mqf0Var2.a(), mqf0Var2.e());
        }
        return Collections.singletonList(mqf0Var2);
    }
}
