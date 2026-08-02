package defpackage;

import com.apollographql.apollo3.api.c;

/* loaded from: classes2.dex */
public final class jpu implements ejg0 {
    public final pax0 a;
    public final pax0 b;

    public jpu(pax0 pax0Var, pax0 pax0Var2) {
        this.a = pax0Var;
        this.b = pax0Var2;
    }

    @Override // defpackage.fc70
    public final void a(bfx bfxVar, c cVar) {
        bfxVar.A1("lightTargetingInput");
        foe foeVar = foe.i;
        l80.a(foeVar).a(bfxVar, cVar, this.a);
        bfxVar.A1("darkTargetingInput");
        l80.a(foeVar).a(bfxVar, cVar, this.b);
    }

    @Override // defpackage.fc70
    public final ep60 adapter() {
        return l80.a(mpu.a);
    }

    @Override // defpackage.fc70
    public final String b() {
        return "query HomeConfiguration($lightTargetingInput: TargetingInput!, $darkTargetingInput: TargetingInput!) { configuration: layoutByTargeting(targeting: $lightTargetingInput) { __typename ...configurationFragment } darkConfiguration: layoutByTargeting(targeting: $darkTargetingInput) { __typename ...darkConfigurationFragment } }  fragment hexColorFragment on HexColor { a hex }  fragment gradientFragment on Gradient { __typename colors { hexColor { __typename ...hexColorFragment } location } ... on LinearGradient { angle } ... on RadialGradient { relativeCenter { x y } relativeRadius { x y } } }  fragment colorFragment on Colors { value { __typename ... on GradientColor { gradient { __typename ...gradientFragment } } ... on HexColor { __typename ...hexColorFragment } } }  fragment configurationOverlayFragment on Overlay { text shape textColor textColors { __typename ...colorFragment } background { color } attributedText { items { __typename ... on TextProperties { name text } } } }  fragment configurationShortcutFragment on Shortcut { name id textStyle { color } background { color colors { __typename ...colorFragment } } commonOverlays { __typename ...configurationOverlayFragment } actions { __typename ... on Action { backgroundColors { __typename ...colorFragment } silent subscriptionButtonType subscriptionProductFeatures subscriptionProductTarget subscriptionPaymentMethod subscriptionWidgetType acquisitionPlatformSubscriptionProperties { page places restrictions } } } }  fragment configurationSectionFragment on Section { metaShortcuts(weightType: LIGHTWEIGHT_ONLY, targeting: $lightTargetingInput) { __typename ...configurationShortcutFragment } shortcuts(weightType: LIGHTWEIGHT_ONLY, targeting: $lightTargetingInput) { __typename ...configurationShortcutFragment } viewType }  fragment configurationFragment on Layout { sectionGroups { sections { __typename ...configurationSectionFragment } } }  fragment darkConfigurationOverlayFragment on Overlay { shape textColor textColors { __typename ...colorFragment } background { color } }  fragment darkConfigurationShortcutFragment on Shortcut { textStyle { color } background { color colors { __typename ...colorFragment } } commonOverlays { __typename ...darkConfigurationOverlayFragment } actions { __typename ... on Action { backgroundColors { __typename ...colorFragment } } } }  fragment darkConfigurationSectionFragment on Section { metaShortcuts(weightType: LIGHTWEIGHT_ONLY, targeting: $darkTargetingInput) { __typename ...darkConfigurationShortcutFragment } viewType }  fragment darkConfigurationFragment on Layout { sectionGroups { sections { __typename ...darkConfigurationSectionFragment } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpu)) {
            return false;
        }
        jpu jpuVar = (jpu) obj;
        return this.a.equals(jpuVar.a) && this.b.equals(jpuVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.fc70
    public final String id() {
        return "144c92764d38988536d8bb72397dea136b11534a9f174efc079a2719a6922a60";
    }

    @Override // defpackage.fc70
    public final String name() {
        return "HomeConfiguration";
    }

    public final String toString() {
        return "HomeConfigurationQuery(lightTargetingInput=" + this.a + ", darkTargetingInput=" + this.b + ')';
    }
}
