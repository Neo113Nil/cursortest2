package xsna;

import com.vk.core.compose.component.semantics.SemanticsConfiguration;

/* compiled from: TopBarParams.kt */
/* loaded from: classes16.dex */
public final class w7p0 {
    public final boolean a;
    public boolean b;
    public final boolean c;
    public final boolean d;
    public final gzs<Boolean> e;
    public final SemanticsConfiguration f;
    public final SemanticsConfiguration g;
    public final SemanticsConfiguration h;
    public final SemanticsConfiguration i;
    public final SemanticsConfiguration j;
    public final SemanticsConfiguration k;
    public final SemanticsConfiguration l;

    public w7p0() {
        throw null;
    }

    public w7p0(boolean z, gzs gzsVar, com.vk.core.compose.component.semantics.a aVar, com.vk.core.compose.component.semantics.a aVar2, com.vk.core.compose.component.semantics.a aVar3, com.vk.core.compose.component.semantics.a aVar4, com.vk.core.compose.component.semantics.a aVar5, com.vk.core.compose.component.semantics.a aVar6, com.vk.core.compose.component.semantics.a aVar7, int i) {
        z = (i & 1) != 0 ? true : z;
        boolean z2 = (i & 8) == 0;
        boolean z3 = (i & 16) == 0;
        gzsVar = (i & 32) != 0 ? new c24(0) : gzsVar;
        aVar = (i & 64) != 0 ? null : aVar;
        aVar2 = (i & 128) != 0 ? null : aVar2;
        aVar3 = (i & 256) != 0 ? null : aVar3;
        aVar4 = (i & 512) != 0 ? null : aVar4;
        aVar5 = (i & 1024) != 0 ? null : aVar5;
        aVar6 = (i & 2048) != 0 ? null : aVar6;
        aVar7 = (i & 8192) != 0 ? null : aVar7;
        this.a = z;
        this.b = true;
        this.c = z2;
        this.d = z3;
        this.e = gzsVar;
        this.f = aVar;
        this.g = aVar2;
        this.h = aVar3;
        this.i = aVar4;
        this.j = aVar5;
        this.k = aVar6;
        this.l = aVar7;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        boolean equals3;
        boolean equals4;
        boolean equals5;
        boolean equals6;
        boolean equals7;
        if (this != obj) {
            if (obj instanceof w7p0) {
                w7p0 w7p0Var = (w7p0) obj;
                if (this.a == w7p0Var.a && this.b == w7p0Var.b && this.c == w7p0Var.c && this.d == w7p0Var.d && epx.f(this.e, w7p0Var.e)) {
                    SemanticsConfiguration semanticsConfiguration = w7p0Var.f;
                    SemanticsConfiguration semanticsConfiguration2 = this.f;
                    if (semanticsConfiguration2 == null) {
                        if (semanticsConfiguration == null) {
                            equals = true;
                            if (equals) {
                                SemanticsConfiguration semanticsConfiguration3 = w7p0Var.g;
                                SemanticsConfiguration semanticsConfiguration4 = this.g;
                                if (semanticsConfiguration4 == null) {
                                    if (semanticsConfiguration3 == null) {
                                        equals2 = true;
                                        if (equals2) {
                                            SemanticsConfiguration semanticsConfiguration5 = w7p0Var.h;
                                            SemanticsConfiguration semanticsConfiguration6 = this.h;
                                            if (semanticsConfiguration6 == null) {
                                                if (semanticsConfiguration5 == null) {
                                                    equals3 = true;
                                                    if (equals3) {
                                                        SemanticsConfiguration semanticsConfiguration7 = w7p0Var.i;
                                                        SemanticsConfiguration semanticsConfiguration8 = this.i;
                                                        if (semanticsConfiguration8 == null) {
                                                            if (semanticsConfiguration7 == null) {
                                                                equals4 = true;
                                                                if (equals4) {
                                                                    SemanticsConfiguration semanticsConfiguration9 = w7p0Var.j;
                                                                    SemanticsConfiguration semanticsConfiguration10 = this.j;
                                                                    if (semanticsConfiguration10 == null) {
                                                                        if (semanticsConfiguration9 == null) {
                                                                            equals5 = true;
                                                                            if (equals5) {
                                                                                SemanticsConfiguration semanticsConfiguration11 = w7p0Var.k;
                                                                                SemanticsConfiguration semanticsConfiguration12 = this.k;
                                                                                if (semanticsConfiguration12 == null) {
                                                                                    if (semanticsConfiguration11 == null) {
                                                                                        equals6 = true;
                                                                                        if (equals6) {
                                                                                            SemanticsConfiguration semanticsConfiguration13 = w7p0Var.l;
                                                                                            SemanticsConfiguration semanticsConfiguration14 = this.l;
                                                                                            if (semanticsConfiguration14 == null) {
                                                                                                if (semanticsConfiguration13 == null) {
                                                                                                    equals7 = true;
                                                                                                    if (equals7) {
                                                                                                    }
                                                                                                }
                                                                                                equals7 = false;
                                                                                                if (equals7) {
                                                                                                }
                                                                                            } else {
                                                                                                if (semanticsConfiguration13 != null) {
                                                                                                    equals7 = semanticsConfiguration14.equals(semanticsConfiguration13);
                                                                                                    if (equals7) {
                                                                                                    }
                                                                                                }
                                                                                                equals7 = false;
                                                                                                if (equals7) {
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    equals6 = false;
                                                                                    if (equals6) {
                                                                                    }
                                                                                } else {
                                                                                    if (semanticsConfiguration11 != null) {
                                                                                        equals6 = semanticsConfiguration12.equals(semanticsConfiguration11);
                                                                                        if (equals6) {
                                                                                        }
                                                                                    }
                                                                                    equals6 = false;
                                                                                    if (equals6) {
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        equals5 = false;
                                                                        if (equals5) {
                                                                        }
                                                                    } else {
                                                                        if (semanticsConfiguration9 != null) {
                                                                            equals5 = semanticsConfiguration10.equals(semanticsConfiguration9);
                                                                            if (equals5) {
                                                                            }
                                                                        }
                                                                        equals5 = false;
                                                                        if (equals5) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            equals4 = false;
                                                            if (equals4) {
                                                            }
                                                        } else {
                                                            if (semanticsConfiguration7 != null) {
                                                                equals4 = semanticsConfiguration8.equals(semanticsConfiguration7);
                                                                if (equals4) {
                                                                }
                                                            }
                                                            equals4 = false;
                                                            if (equals4) {
                                                            }
                                                        }
                                                    }
                                                }
                                                equals3 = false;
                                                if (equals3) {
                                                }
                                            } else {
                                                if (semanticsConfiguration5 != null) {
                                                    equals3 = semanticsConfiguration6.equals(semanticsConfiguration5);
                                                    if (equals3) {
                                                    }
                                                }
                                                equals3 = false;
                                                if (equals3) {
                                                }
                                            }
                                        }
                                    }
                                    equals2 = false;
                                    if (equals2) {
                                    }
                                } else {
                                    if (semanticsConfiguration3 != null) {
                                        equals2 = semanticsConfiguration4.equals(semanticsConfiguration3);
                                        if (equals2) {
                                        }
                                    }
                                    equals2 = false;
                                    if (equals2) {
                                    }
                                }
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    } else {
                        if (semanticsConfiguration != null) {
                            equals = semanticsConfiguration2.equals(semanticsConfiguration);
                            if (equals) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int a = sf3.a(qoy.b(qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, false), 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        SemanticsConfiguration semanticsConfiguration = this.f;
        int hashCode = (a + (semanticsConfiguration == null ? 0 : semanticsConfiguration.hashCode())) * 31;
        SemanticsConfiguration semanticsConfiguration2 = this.g;
        int hashCode2 = (hashCode + (semanticsConfiguration2 == null ? 0 : semanticsConfiguration2.hashCode())) * 31;
        SemanticsConfiguration semanticsConfiguration3 = this.h;
        int hashCode3 = (hashCode2 + (semanticsConfiguration3 == null ? 0 : semanticsConfiguration3.hashCode())) * 31;
        SemanticsConfiguration semanticsConfiguration4 = this.i;
        int hashCode4 = (hashCode3 + (semanticsConfiguration4 == null ? 0 : semanticsConfiguration4.hashCode())) * 31;
        SemanticsConfiguration semanticsConfiguration5 = this.j;
        int hashCode5 = (hashCode4 + (semanticsConfiguration5 == null ? 0 : semanticsConfiguration5.hashCode())) * 31;
        SemanticsConfiguration semanticsConfiguration6 = this.k;
        int hashCode6 = (hashCode5 + (semanticsConfiguration6 == null ? 0 : semanticsConfiguration6.hashCode())) * 961;
        SemanticsConfiguration semanticsConfiguration7 = this.l;
        return (hashCode6 + (semanticsConfiguration7 != null ? semanticsConfiguration7.hashCode() : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopBarParams(isBackButtonAllowed=");
        sb.append(this.a);
        sb.append(", isForceDisplayBackButton=false, isFiltersAllowed=");
        sb.append(this.b);
        sb.append(", isFiltersWithButton=");
        sb.append(this.c);
        sb.append(", canBindTitleWithFilterButton=");
        sb.append(this.d);
        sb.append(", hasDrawerEntryPoint=");
        sb.append(this.e);
        sb.append(", titleSemanticsConfiguration=");
        SemanticsConfiguration semanticsConfiguration = this.f;
        sb.append((Object) (semanticsConfiguration == null ? "null" : yfi0.a(semanticsConfiguration)));
        sb.append(", backButtonSemanticsConfiguration=");
        SemanticsConfiguration semanticsConfiguration2 = this.g;
        sb.append((Object) (semanticsConfiguration2 == null ? "null" : yfi0.a(semanticsConfiguration2)));
        sb.append(", editButtonSemanticsConfiguration=");
        SemanticsConfiguration semanticsConfiguration3 = this.h;
        sb.append((Object) (semanticsConfiguration3 == null ? "null" : yfi0.a(semanticsConfiguration3)));
        sb.append(", saveButtonSemanticsConfiguration=");
        SemanticsConfiguration semanticsConfiguration4 = this.i;
        sb.append((Object) (semanticsConfiguration4 == null ? "null" : yfi0.a(semanticsConfiguration4)));
        sb.append(", cancelEditButtonSemanticsConfiguration=");
        SemanticsConfiguration semanticsConfiguration5 = this.j;
        sb.append((Object) (semanticsConfiguration5 == null ? "null" : yfi0.a(semanticsConfiguration5)));
        sb.append(", filterButtonSemanticsConfiguration=");
        SemanticsConfiguration semanticsConfiguration6 = this.k;
        sb.append((Object) (semanticsConfiguration6 == null ? "null" : yfi0.a(semanticsConfiguration6)));
        sb.append(", downloadButtonSemanticsConfiguration=");
        sb.append((Object) "null");
        sb.append(", optionsButtonSemanticsConfiguration=");
        SemanticsConfiguration semanticsConfiguration7 = this.l;
        sb.append((Object) (semanticsConfiguration7 == null ? "null" : yfi0.a(semanticsConfiguration7)));
        sb.append(", clearButtonSemanticsConfiguration=");
        sb.append((Object) "null");
        sb.append(')');
        return sb.toString();
    }
}
