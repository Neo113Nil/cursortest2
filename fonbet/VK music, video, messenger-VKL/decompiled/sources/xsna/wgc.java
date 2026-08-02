package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.api.generated.market.dto.MarketReferenceDto;
import com.vk.dto.common.DialogBackground;
import com.vk.ecomm.catalog.impl.geo.e;
import com.vk.im.engine.models.dialogs.DialogTheme;
import com.vk.im.engine.models.dialogs.c;
import com.vk.im.ui.components.theme_chooser.ThemeChooserState;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class wgc implements izs {
    public final /* synthetic */ int b = 2;
    public final /* synthetic */ String c;

    public /* synthetic */ wgc(com.vk.im.ui.components.theme_chooser.b bVar, String str) {
        this.c = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
    
        if (r12 != null) goto L32;
     */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        String str;
        String str2;
        switch (this.b) {
            case 0:
                return new e.a.b((MarketReferenceDto) obj, this.c);
            case 1:
                qgi0.h((tgi0) obj, this.c);
                return s3q0.a;
            default:
                ThemeChooserState themeChooserState = (ThemeChooserState) obj;
                List<DialogTheme> list = themeChooserState.f;
                List<DialogBackground> list2 = themeChooserState.g;
                String str3 = this.c;
                DialogBackground X0 = com.vk.im.ui.components.theme_chooser.b.X0(str3, list, list2);
                List<DialogTheme> list3 = list;
                Iterator<T> it = list3.iterator();
                while (true) {
                    obj2 = null;
                    if (it.hasNext()) {
                        obj3 = it.next();
                        if (epx.f(((DialogTheme) obj3).b.a, str3)) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                DialogTheme dialogTheme = (DialogTheme) obj3;
                if (dialogTheme != null) {
                    if (epx.f(dialogTheme.b, c.h.c)) {
                        Iterator<T> it2 = list3.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                DialogTheme dialogTheme2 = (DialogTheme) next;
                                if (!epx.f(dialogTheme2, dialogTheme) && Arrays.equals(dialogTheme2.Ab(dhr0.C(), 0L, false).D, dialogTheme.Ab(dhr0.C(), 0L, false).D)) {
                                    obj2 = next;
                                }
                            }
                        }
                        DialogTheme dialogTheme3 = (DialogTheme) obj2;
                        if (dialogTheme3 != null) {
                            com.vk.im.engine.models.dialogs.c cVar = dialogTheme3.b;
                            if (cVar != null) {
                                str2 = cVar.a;
                                break;
                            }
                        }
                    }
                    str2 = str3;
                    if (str2 != null) {
                        str = str2;
                        return ThemeChooserState.a(themeChooserState, ThemeChooserState.ListKind.THEME, str3, str, X0, false, null, null, null, PsExtractor.VIDEO_STREAM_MASK);
                    }
                }
                str = str3;
                return ThemeChooserState.a(themeChooserState, ThemeChooserState.ListKind.THEME, str3, str, X0, false, null, null, null, PsExtractor.VIDEO_STREAM_MASK);
        }
    }

    public /* synthetic */ wgc(String str) {
        this.c = str;
    }

    public /* synthetic */ wgc(boolean z, String str) {
        this.c = str;
    }
}
