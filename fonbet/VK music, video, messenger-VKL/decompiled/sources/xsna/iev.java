package xsna;

import androidx.compose.runtime.a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.compose.component.tile.Tile$TextAlignment;
import com.vk.core.compose.component.tile.Tile$TextSize;

/* compiled from: HorizontalListItem.kt */
/* loaded from: classes17.dex */
public abstract class iev {

    /* compiled from: HorizontalListItem.kt */
    public static final class a extends iev {
        public static final a a = new a();

        @Override // xsna.iev
        public final void a(int i, androidx.compose.runtime.a aVar) {
            androidx.compose.runtime.a M = aVar.M(-262797011);
            int i2 = i & 1;
            if (M.t(i2, i2 != 0)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-262797011, i, -1, "com.vk.core.compose.component.horizontal.HorizontalListItem.TextContent.Empty.Draw (HorizontalListItem.kt:165)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new hev(this, i, 0);
            }
        }
    }

    /* compiled from: HorizontalListItem.kt */
    public static final class b {
        public static fsv0 a(String str, String str2, String str3, azo0 azo0Var, azo0 azo0Var2, azo0 azo0Var3, String str4, azo0 azo0Var4, azo0 azo0Var5, String str5, Tile$TextAlignment tile$TextAlignment, Tile$TextSize tile$TextSize, androidx.compose.runtime.a aVar, int i, int i2) {
            String str6 = (i2 & 2) != 0 ? null : str2;
            String str7 = (i2 & 4) != 0 ? null : str3;
            azo0 azo0Var6 = (i2 & 8) != 0 ? null : azo0Var;
            azo0 azo0Var7 = (i2 & 16) != 0 ? null : azo0Var2;
            azo0 azo0Var8 = (i2 & 32) != 0 ? null : azo0Var3;
            String str8 = (i2 & 64) != 0 ? null : str4;
            azo0 azo0Var9 = (i2 & 128) != 0 ? null : azo0Var4;
            azo0 azo0Var10 = (i2 & 256) != 0 ? null : azo0Var5;
            String str9 = (i2 & 512) != 0 ? null : str5;
            Tile$TextAlignment tile$TextAlignment2 = (i2 & 1024) != 0 ? Tile$TextAlignment.Start : tile$TextAlignment;
            Tile$TextSize tile$TextSize2 = (i2 & 2048) != 0 ? Tile$TextSize.Small : tile$TextSize;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(801412200, 0, i, "com.vk.core.compose.component.horizontal.HorizontalListItem.TextContent.Rich.invoke (HorizontalListItem.kt:230)");
            }
            fsv0 b = b(ws2.e(str), str6 != null ? ws2.e(str6) : null, str7 != null ? ws2.e(str7) : null, azo0Var6, azo0Var7, azo0Var8, str8 != null ? ws2.e(str8) : null, azo0Var9, azo0Var10, str9 != null ? ws2.e(str9) : null, tile$TextAlignment2, tile$TextSize2, aVar, i & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return b;
        }

        public static fsv0 b(us2 us2Var, us2 us2Var2, us2 us2Var3, azo0 azo0Var, azo0 azo0Var2, azo0 azo0Var3, us2 us2Var4, azo0 azo0Var4, azo0 azo0Var5, us2 us2Var5, Tile$TextAlignment tile$TextAlignment, Tile$TextSize tile$TextSize, androidx.compose.runtime.a aVar, int i, int i2) {
            us2 us2Var6 = (i2 & 2) != 0 ? null : us2Var2;
            us2 us2Var7 = (i2 & 4) != 0 ? null : us2Var3;
            azo0 azo0Var6 = (i2 & 8) != 0 ? null : azo0Var;
            azo0 azo0Var7 = (i2 & 16) != 0 ? null : azo0Var2;
            azo0 azo0Var8 = (i2 & 32) != 0 ? null : azo0Var3;
            azo0 azo0Var9 = (i2 & 128) != 0 ? null : azo0Var4;
            azo0 azo0Var10 = (i2 & 256) != 0 ? null : azo0Var5;
            us2 us2Var8 = (i2 & 512) != 0 ? null : us2Var5;
            Tile$TextAlignment tile$TextAlignment2 = (i2 & 1024) != 0 ? Tile$TextAlignment.Start : tile$TextAlignment;
            Tile$TextSize tile$TextSize2 = (i2 & 2048) != 0 ? Tile$TextSize.Small : tile$TextSize;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(605015212, 0, i, "com.vk.core.compose.component.horizontal.HorizontalListItem.TextContent.Rich.invoke (HorizontalListItem.kt:259)");
            }
            Object x = aVar.x();
            if (x == a.C0011a.a) {
                fsv0 fsv0Var = new fsv0(us2Var, us2Var6, us2Var7, azo0Var6, azo0Var7, azo0Var8, us2Var4, azo0Var9, azo0Var10, us2Var8, tile$TextAlignment2, tile$TextSize2);
                aVar.R(fsv0Var);
                x = fsv0Var;
            }
            fsv0 fsv0Var2 = (fsv0) x;
            ((zak0) fsv0Var2.a).setValue(us2Var);
            ((zak0) fsv0Var2.b).setValue(us2Var6);
            ((zak0) fsv0Var2.c).setValue(us2Var7);
            ((zak0) fsv0Var2.d).setValue(azo0Var6);
            ((zak0) fsv0Var2.e).setValue(azo0Var7);
            ((zak0) fsv0Var2.f).setValue(azo0Var8);
            ((zak0) fsv0Var2.g).setValue(us2Var4);
            ((zak0) fsv0Var2.h).setValue(azo0Var9);
            ((zak0) fsv0Var2.i).setValue(azo0Var10);
            ((zak0) fsv0Var2.j).setValue(us2Var8);
            ((zak0) fsv0Var2.k).setValue(tile$TextAlignment2);
            ((zak0) fsv0Var2.l).setValue(tile$TextSize2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return fsv0Var2;
        }
    }

    /* compiled from: HorizontalListItem.kt */
    public static final class c {
        public static u3k0 a(String str, String str2, int i, com.vk.core.compose.component.semantics.a aVar, androidx.compose.runtime.a aVar2, int i2, int i3) {
            if ((i3 & 4) != 0) {
                str2 = null;
            }
            if ((i3 & 16) != 0) {
                i = Integer.MAX_VALUE;
            }
            int i4 = i;
            com.vk.core.compose.component.semantics.a aVar3 = (i3 & 32) != 0 ? null : aVar;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1431360607, i2, -1, "com.vk.core.compose.component.horizontal.HorizontalListItem.TextContent.Small.invoke (HorizontalListItem.kt:179)");
            }
            u3k0 b = b(null, str != null ? ws2.e(str) : null, str2 != null ? ws2.e(str2) : null, null, i4, aVar3, aVar2, i2 & 4186112, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return b;
        }

        public static u3k0 b(us2 us2Var, us2 us2Var2, us2 us2Var3, us2 us2Var4, int i, SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar, int i2, int i3) {
            us2 us2Var5 = (i3 & 1) != 0 ? null : us2Var;
            us2 us2Var6 = (i3 & 4) != 0 ? null : us2Var3;
            us2 us2Var7 = (i3 & 8) != 0 ? null : us2Var4;
            if ((i3 & 16) != 0) {
                i = Integer.MAX_VALUE;
            }
            int i4 = i;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(369407379, i2, -1, "com.vk.core.compose.component.horizontal.HorizontalListItem.TextContent.Small.invoke (HorizontalListItem.kt:196)");
            }
            Object x = aVar.x();
            if (x == a.C0011a.a) {
                u3k0 u3k0Var = new u3k0(us2Var5, us2Var2, us2Var6, us2Var7, i4, semanticsConfiguration);
                aVar.R(u3k0Var);
                x = u3k0Var;
            }
            u3k0 u3k0Var2 = (u3k0) x;
            ((zak0) u3k0Var2.a).setValue(us2Var5);
            ((zak0) u3k0Var2.b).setValue(us2Var2);
            ((zak0) u3k0Var2.c).setValue(us2Var6);
            ((zak0) u3k0Var2.d).setValue(us2Var7);
            ((wak0) u3k0Var2.e).C(i4);
            ((zak0) u3k0Var2.f).setValue(semanticsConfiguration);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return u3k0Var2;
        }
    }

    public abstract void a(int i, androidx.compose.runtime.a aVar);
}
