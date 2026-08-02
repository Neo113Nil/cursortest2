package xsna;

import com.google.common.collect.ImmutableList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import xsna.fi20;

/* compiled from: GaplessInfoHolder.java */
/* loaded from: classes12.dex */
public final class aht {
    public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    public final boolean a(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            String str2 = y2r0.a;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.a = parseInt;
            this.b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0087, code lost:
    
        if (r0.apply(r6) != false) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(fi20 fi20Var) {
        fi20.a aVar;
        fi20Var.getClass();
        ImmutableList.b bVar = ImmutableList.c;
        ImmutableList.a aVar2 = new ImmutableList.a();
        fi20.a[] aVarArr = fi20Var.a;
        int length = aVarArr.length;
        int i = 0;
        while (true) {
            fi20.a aVar3 = null;
            if (i >= length) {
                break;
            }
            fi20.a aVar4 = aVarArr[i];
            if (pbg.class.isAssignableFrom(aVar4.getClass())) {
                fi20.a aVar5 = (fi20.a) pbg.class.cast(aVar4);
                if (((pbg) aVar5).c.equals("iTunSMPB")) {
                    aVar3 = aVar5;
                }
            }
            if (aVar3 != null) {
                aVar2.c(aVar3);
            }
            i++;
        }
        ImmutableList.b listIterator = aVar2.g().listIterator(0);
        while (listIterator.hasNext()) {
            if (a(((pbg) listIterator.next()).d)) {
                return;
            }
        }
        ufl uflVar = new ufl(1);
        fi20Var.getClass();
        ImmutableList.b bVar2 = ImmutableList.c;
        ImmutableList.a aVar6 = new ImmutableList.a();
        for (fi20.a aVar7 : fi20Var.a) {
            if (ugx.class.isAssignableFrom(aVar7.getClass())) {
                aVar = (fi20.a) ugx.class.cast(aVar7);
            }
            aVar = null;
            if (aVar != null) {
                aVar6.c(aVar);
            }
        }
        ImmutableList.b listIterator2 = aVar6.g().listIterator(0);
        while (listIterator2.hasNext() && !a(((ugx) listIterator2.next()).d)) {
        }
    }
}
