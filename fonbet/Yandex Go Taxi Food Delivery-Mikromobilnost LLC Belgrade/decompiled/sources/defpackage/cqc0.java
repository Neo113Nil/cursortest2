package defpackage;

import com.apollographql.apollo3.api.c;

/* loaded from: classes8.dex */
public final class cqc0 implements ejg0 {
    public final yf70 a;
    public final yf70 b;
    public final yf70 c = vf70.a;
    public final yf70 d;
    public final pax0 e;

    public cqc0(yf70 yf70Var, yf70 yf70Var2, yf70 yf70Var3, pax0 pax0Var) {
        this.a = yf70Var;
        this.b = yf70Var2;
        this.d = yf70Var3;
        this.e = pax0Var;
    }

    @Override // defpackage.fc70
    public final void a(bfx bfxVar, c cVar) {
        yf70 yf70Var = this.a;
        if (yf70Var instanceof xf70) {
            bfxVar.A1("clientFeatures");
            lqy lqyVar = new lqy(l80.a);
            Object obj = ((xf70) yf70Var).a;
            if (obj == null) {
                bfxVar.k2();
            } else {
                lqyVar.a(bfxVar, cVar, obj);
            }
        }
        yf70 yf70Var2 = this.b;
        if (yf70Var2 instanceof xf70) {
            bfxVar.A1("supportedFeatures");
            lqy lqyVar2 = new lqy(l80.a(foe.g));
            Object obj2 = ((xf70) yf70Var2).a;
            if (obj2 == null) {
                bfxVar.k2();
            } else {
                lqyVar2.a(bfxVar, cVar, obj2);
            }
        }
        yf70 yf70Var3 = this.c;
        if (yf70Var3 instanceof xf70) {
            bfxVar.A1("existingPlaques");
            lqy lqyVar3 = new lqy(l80.a(g97.i));
            Object obj3 = ((xf70) yf70Var3).a;
            if (obj3 == null) {
                bfxVar.k2();
            } else {
                lqyVar3.a(bfxVar, cVar, obj3);
            }
        }
        yf70 yf70Var4 = this.d;
        if (yf70Var4 instanceof xf70) {
            bfxVar.A1("sizeHint");
            l80.k.a(bfxVar, cVar, ((xf70) yf70Var4).a);
        }
        bfxVar.A1("targetingInput");
        l80.a(foe.i).a(bfxVar, cVar, this.e);
    }

    @Override // defpackage.fc70
    public final ep60 adapter() {
        return l80.a(dqc0.a);
    }

    @Override // defpackage.fc70
    public final String b() {
        return "query Plaque($clientFeatures: [String!], $supportedFeatures: [SupportedFeatureInput!], $existingPlaques: [ExistingPlaqueInput!], $sizeHint: Int, $targetingInput: TargetingInput!) { plaque: plaque(plaqueInput: { clientFeatures: $clientFeatures supportedFeatures: $supportedFeatures existingPlaques: $existingPlaques sizeHint: $sizeHint } , targeting: $targetingInput) { __typename ...plaqueDefinitions } }  fragment plaqueContentDescription on ContentDescription { text templates actionText accessibilityEnabled }  fragment strictPlaqueAction on StrictCrossAction { __typename ... on DeeplinkCrossAction { deeplink } ... on ServiceSpecificCrossAction { type params { key value } } ... on JustInteractCrossAction { __typename } ... on ActionPerformCrossAction { actionId actionToken actionMeta } }  fragment plaqueIndent on IndentRules { indentLeft indentRight indentTop indentBottom }  fragment plaqueColor on Color { color opacity position }  fragment plaquePoint on Point { x y }  fragment plaqueLinearGradient on LinearColorSettings { colors { __typename ...plaqueColor } startPoint { __typename ...plaquePoint } endPoint { __typename ...plaquePoint } }  fragment plaqueRadialGradient on RadialColorSettings { colors { __typename ...plaqueColor } centralPoint { __typename ...plaquePoint } }  fragment plaqueColorSettings on ColorSettings { type linear { __typename ...plaqueLinearGradient } radial { __typename ...plaqueRadialGradient } }  fragment plaqueCorner on CornerSettings { type heightFix }  fragment plaqueShapeSettings on ShapeSettings { leftTopCorner { __typename ...plaqueCorner } rightTopCorner { __typename ...plaqueCorner } leftBottomCorner { __typename ...plaqueCorner } rightBottomCorner { __typename ...plaqueCorner } }  fragment plaqueDisplayRules on DisplayRules { indentRules { __typename ...plaqueIndent } backgroundColorSettings { __typename ...plaqueColorSettings } backgroundShapeSettings { __typename ...plaqueShapeSettings } }  fragment plaqueWidgetRules on DisplayWidgetRules { displayRules { __typename ...plaqueDisplayRules } opacity horizontalRule verticalRule widthFix widthType }  fragment plaqueTextProperty on TaxiATTextProperty { text textDecoration color metaColor metaStyle fontSize fontStyle fontWeight }  fragment plaqueLinkProperty on TaxiATLinkProperty { description { __typename ...plaqueTextProperty } link }  fragment plaqueImageProperty on TaxiATImageProperty { color metaColor verticalAlignment imageTag width height }  fragment plaqueProperty on TaxiATProperty { __typename ... on TaxiATTextProperty { __typename ...plaqueTextProperty } ... on TaxiATLinkProperty { __typename ...plaqueLinkProperty } ... on TaxiATImageProperty { __typename ...plaqueImageProperty } }  fragment plaqueContainer on TaxiATContainer { metaColor items { __typename ...plaqueProperty } }  fragment plaqueUnit on TaxiATUnit { __typename ... on TaxiATTextProperty { __typename ...plaqueTextProperty } ... on TaxiATLinkProperty { __typename ...plaqueLinkProperty } ... on TaxiATImageProperty { __typename ...plaqueImageProperty } ... on TaxiATContainer { __typename ...plaqueContainer } }  fragment plaqueTextWidget on TextWidget { text { items { __typename ...plaqueUnit } } lineHeight }  fragment plaqueBalanceWidget on BalanceWidget { title { items { __typename ...plaqueUnit } } subtitle { items { __typename ...plaqueUnit } } balance { items { __typename ...plaqueUnit } } }  fragment plaqueButtonWidget on ButtonWidget { text { items { __typename ...plaqueUnit } } }  fragment plaqueSwitchWidget on SwitchWidget { text { items { __typename ...plaqueUnit } } }  fragment plaqueIconWidget on IconWidget { image }  fragment plaqueWidget on CrossWidget { widgetId contentDescription { __typename ...plaqueContentDescription } templates strictAction { __typename ...strictPlaqueAction } displayWidgetRules { __typename ...plaqueWidgetRules } type textWidget { __typename ...plaqueTextWidget } balanceWidget { __typename ...plaqueBalanceWidget } buttonWidget { __typename ...plaqueButtonWidget } switchWidget { __typename ...plaqueSwitchWidget } iconWidget { __typename ...plaqueIconWidget } }  fragment widgetGroupWidth on Width { __typename ... on FillWidth { __typename } ... on FitWidth { __typename } ... on FixWidth { fix } }  fragment groupDisplayRules on WidgetGroupDisplayRules { indentRules { __typename ...plaqueIndent } backgroundColorSettings { __typename ...plaqueColorSettings } backgroundShapeSettings { __typename ...plaqueShapeSettings } width { __typename ...widgetGroupWidth } }  fragment typedWidgetGroupProperties on TypedCrossWidgetGroupProperties { __typename ... on RowCrossWidgetGroupProperties { verticalContentAlignment } ... on ColumnCrossWidgetGroupProperties { horizontalContentAlignment } ... on BoxCrossWidgetGroupProperties { horizontalContentAlignment verticalContentAlignment } }  fragment plaqueWidgetGroup on CrossWidgetGroup { widgetGroupId widgets groupDisplayRules { __typename ...groupDisplayRules } typedProperties { __typename ...typedWidgetGroupProperties } strictAction { __typename ...strictPlaqueAction } contentDescription { __typename ...plaqueContentDescription } }  fragment plaqueLevelElement on ElementLevel { widgetId widgetGroupId type }  fragment plaqueWidgetsLevel on CrossWidgetsLevel { widgetsLevelId contentDescription { __typename ...plaqueContentDescription } elements { __typename ...plaqueLevelElement } displayRules { __typename ...plaqueDisplayRules } strictAction { __typename ...strictPlaqueAction } }  fragment plaquePredicate on CommonPredicate { type argCheckingPredicate { type argName } booleanLiteralPredicate { value } notPredicate { nodeId } unifyingPredicate { type nodeIds } comparisonPredicate { type argName intValue doubleValue stringValue } containsPredicate { argName intValue stringValue } inSetPredicate { argName intSet stringSet } }  fragment plaquePredicateTree on PredicateTree { rootNodeId nodes { __typename ...plaquePredicate } }  fragment plaqueMetric on MetricContext { metrics { name value } }  fragment plaqueIconNotification on IconPlaqueNotification { url displayRules { __typename ... on PlaqueNotificationDisplayRules { position } } }  fragment plaqueCounterNotification on CounterPlaqueNotification { count displayRules { __typename ... on PlaqueNotificationDisplayRules { position } } }  fragment plaque on CrossPlaque { plaqueId priority widgetsLevelIds contentDescription { __typename ...plaqueContentDescription } condition { __typename ...plaquePredicateTree } displayRules { __typename ...plaqueDisplayRules } strictAction { __typename ...strictPlaqueAction } metricContext { __typename ...plaqueMetric } params { showAfter closeAfter } seenContext notification { __typename ...plaqueIconNotification ...plaqueCounterNotification } serviceMeta }  fragment plaqueDefinitions on CrossPlaqueDefinitions { widgets { __typename ...plaqueWidget } widgetGroups { __typename ...plaqueWidgetGroup } widgetsLevels { __typename ...plaqueWidgetsLevel } plaques { __typename ...plaque } prefetchPlaqueList { __typename ...plaque } defaultPlaqueList { __typename ...plaque } fallbackPlaqueList { __typename ...plaque } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqc0)) {
            return false;
        }
        cqc0 cqc0Var = (cqc0) obj;
        return this.a.equals(cqc0Var.a) && this.b.equals(cqc0Var.b) && this.c.equals(cqc0Var.c) && this.d.equals(cqc0Var.d) && jl40.l(this.e, cqc0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + vfc.b(this.d, vfc.b(this.c, vfc.b(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    @Override // defpackage.fc70
    public final String id() {
        return "e7bba1a864efaf2827414af890eff94f68dccfd56acdea96771307b9f4ed2896";
    }

    @Override // defpackage.fc70
    public final String name() {
        return "Plaque";
    }

    public final String toString() {
        return "PlaqueQuery(clientFeatures=" + this.a + ", supportedFeatures=" + this.b + ", existingPlaques=" + this.c + ", sizeHint=" + this.d + ", targetingInput=" + this.e + ')';
    }
}
