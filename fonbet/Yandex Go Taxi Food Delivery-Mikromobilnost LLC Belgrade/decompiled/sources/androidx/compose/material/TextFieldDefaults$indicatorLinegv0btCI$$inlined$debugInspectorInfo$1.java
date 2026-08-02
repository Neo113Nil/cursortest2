package androidx.compose.material;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.g131;
import defpackage.h8w;
import defpackage.jmy0;
import defpackage.n;
import defpackage.tls;
import defpackage.v2w;
import defpackage.zx40;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv2w;", "Lzy11;", "invoke", "(Lv2w;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
/* renamed from: androidx.compose.material.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1, reason: invalid class name */
/* loaded from: classes10.dex */
public final class TextFieldDefaults$indicatorLinegv0btCI$$inlined$debugInspectorInfo$1 extends Lambda implements tls {
    final /* synthetic */ jmy0 $colors$inlined;
    final /* synthetic */ boolean $enabled$inlined;
    final /* synthetic */ float $focusedIndicatorLineThickness$inlined;
    final /* synthetic */ h8w $interactionSource$inlined;
    final /* synthetic */ boolean $isError$inlined;
    final /* synthetic */ float $unfocusedIndicatorLineThickness$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDefaults$indicatorLinegv0btCI$$inlined$debugInspectorInfo$1(boolean z, boolean z2, zx40 zx40Var, jmy0 jmy0Var, float f, float f2) {
        super(1);
        this.$enabled$inlined = z;
        this.$isError$inlined = z2;
        this.$interactionSource$inlined = zx40Var;
        this.$colors$inlined = jmy0Var;
        this.$focusedIndicatorLineThickness$inlined = f;
        this.$unfocusedIndicatorLineThickness$inlined = f2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        v2w v2wVar = (v2w) obj;
        v2wVar.getClass();
        g131 g131Var = v2wVar.a;
        g131Var.b(BackendConfig.Restrictions.ENABLED, Boolean.valueOf(this.$enabled$inlined));
        g131Var.b("isError", Boolean.valueOf(this.$isError$inlined));
        g131Var.b("interactionSource", this.$interactionSource$inlined);
        g131Var.b("colors", this.$colors$inlined);
        n.x(this.$focusedIndicatorLineThickness$inlined, g131Var, "focusedIndicatorLineThickness");
        n.x(this.$unfocusedIndicatorLineThickness$inlined, g131Var, "unfocusedIndicatorLineThickness");
        return zy11.a;
    }
}
