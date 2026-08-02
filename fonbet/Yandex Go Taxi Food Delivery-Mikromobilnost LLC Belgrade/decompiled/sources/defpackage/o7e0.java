package defpackage;

import com.apollographql.apollo3.api.c;

/* loaded from: classes2.dex */
public final class o7e0 implements ejg0 {
    public final String a;
    public final pax0 b;
    public final pax0 c;

    public o7e0(String str, pax0 pax0Var, pax0 pax0Var2) {
        this.a = str;
        this.b = pax0Var;
        this.c = pax0Var2;
    }

    @Override // defpackage.fc70
    public final void a(bfx bfxVar, c cVar) {
        bfxVar.A1("shortcutId");
        foe foeVar = l80.a;
        bfxVar.r0(this.a);
        bfxVar.A1("lightTargetingInput");
        foe foeVar2 = foe.i;
        l80.a(foeVar2).a(bfxVar, cVar, this.b);
        bfxVar.A1("darkTargetingInput");
        l80.a(foeVar2).a(bfxVar, cVar, this.c);
    }

    @Override // defpackage.fc70
    public final ep60 adapter() {
        return l80.a(r7e0.a);
    }

    @Override // defpackage.fc70
    public final String b() {
        return "query PopupConfiguration($shortcutId: ID!, $lightTargetingInput: TargetingInput!, $darkTargetingInput: TargetingInput!) { configuration: shortcut(targeting: $lightTargetingInput, id: $shortcutId) { __typename ...popupConfigurationFragment } darkConfiguration: shortcut(targeting: $darkTargetingInput, id: $shortcutId) { __typename ...darkPopupConfigurationFragment } }  fragment hexColorFragment on HexColor { a hex }  fragment gradientFragment on Gradient { __typename colors { hexColor { __typename ...hexColorFragment } location } ... on LinearGradient { angle } ... on RadialGradient { relativeCenter { x y } relativeRadius { x y } } }  fragment colorFragment on Colors { value { __typename ... on GradientColor { gradient { __typename ...gradientFragment } } ... on HexColor { __typename ...hexColorFragment } } }  fragment configurationOverlayFragment on Overlay { text shape textColor textColors { __typename ...colorFragment } background { color } attributedText { items { __typename ... on TextProperties { name text } } } }  fragment popupConfigurationFragment on Shortcut { name id popups { textColor background { color } commonOverlays { __typename ...configurationOverlayFragment } buttons { textColor backgroundColor action { actionType silent subscriptionButtonType subscriptionPaymentMethod subscriptionProductFeatures subscriptionWidgetType acquisitionPlatformSubscriptionProperties { page places restrictions } } subscriptionProductTarget } } }  fragment darkConfigurationOverlayFragment on Overlay { shape textColor textColors { __typename ...colorFragment } background { color } }  fragment darkPopupConfigurationFragment on Shortcut { popups { textColor background { color } commonOverlays { __typename ...darkConfigurationOverlayFragment } buttons { textColor backgroundColor action { actionType } } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7e0)) {
            return false;
        }
        o7e0 o7e0Var = (o7e0) obj;
        return jl40.l(this.a, o7e0Var.a) && this.b.equals(o7e0Var.b) && this.c.equals(o7e0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // defpackage.fc70
    public final String id() {
        return "5a3c3a1fc69e9842968e0cb7fcb2c30677700fe8c4f3c2adc458ff8e7da31713";
    }

    @Override // defpackage.fc70
    public final String name() {
        return "PopupConfiguration";
    }

    public final String toString() {
        return "PopupConfigurationQuery(shortcutId=" + this.a + ", lightTargetingInput=" + this.b + ", darkTargetingInput=" + this.c + ')';
    }
}
