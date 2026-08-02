package defpackage;

import kotlinx.datetime.internal.format.OptionalFormatStructure$PropertyWithDefault$isDefaultComparisonPredicate$1;

/* loaded from: classes9.dex */
public final class nvc implements fie0 {
    public final Object a;
    public final OptionalFormatStructure$PropertyWithDefault$isDefaultComparisonPredicate$1 b;

    public nvc(Object obj, OptionalFormatStructure$PropertyWithDefault$isDefaultComparisonPredicate$1 optionalFormatStructure$PropertyWithDefault$isDefaultComparisonPredicate$1) {
        this.a = obj;
        this.b = optionalFormatStructure$PropertyWithDefault$isDefaultComparisonPredicate$1;
    }

    @Override // defpackage.fie0
    public final boolean test(Object obj) {
        return jl40.l(this.b.invoke(obj), this.a);
    }
}
