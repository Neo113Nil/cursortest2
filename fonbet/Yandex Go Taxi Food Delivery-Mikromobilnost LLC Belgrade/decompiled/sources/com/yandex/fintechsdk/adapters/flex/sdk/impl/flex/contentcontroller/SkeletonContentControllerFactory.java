package com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.contentcontroller;

import com.yandex.fintechsdk.entities.theme.Theme;
import defpackage.bks0;
import defpackage.evu0;
import defpackage.gfe;
import defpackage.l1o;
import defpackage.lfe;
import defpackage.see;
import defpackage.vh5;
import defpackage.yce;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/contentcontroller/SkeletonContentControllerFactory;", "Llfe;", "Lvh5;", "themeProvider", "<init>", "(Lvh5;)V", "Ll1o;", "context", "Lsee;", "content", "Lgfe;", "get", "(Ll1o;Lsee;)Lgfe;", "Lvh5;", "Companion", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SkeletonContentControllerFactory implements lfe {
    private static final String DEFAULT_DARK_SKELETON_COLOR = "#FF393B40";
    private static final String DEFAULT_LIGHT_SKELETON_COLOR = "#FFEDEFF2";
    private final vh5 themeProvider;

    public SkeletonContentControllerFactory(vh5 vh5Var) {
        this.themeProvider = vh5Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String get$lambda$0(boolean z, String str) {
        List W;
        try {
            W = evu0.W(str, new String[]{","}, (r2 & 4) != 0 ? 0 : 2);
            return (String) (z ? W.get(0) : W.get(1));
        } catch (Exception unused) {
            return z ? DEFAULT_LIGHT_SKELETON_COLOR : DEFAULT_DARK_SKELETON_COLOR;
        }
    }

    @Override // defpackage.lfe
    public /* bridge */ /* synthetic */ void dispose(l1o l1oVar, see seeVar) {
    }

    @Override // defpackage.lfe
    public gfe get(l1o context, see content) {
        return new bks0(context.e, new yce(this.themeProvider.getTheme() == Theme.DAY, 27));
    }
}
