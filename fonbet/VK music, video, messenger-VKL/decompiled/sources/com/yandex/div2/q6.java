package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.c5;
import com.yandex.div2.eb;
import com.yandex.div2.f9;
import com.yandex.div2.ga;
import com.yandex.div2.h3;
import com.yandex.div2.i5;
import com.yandex.div2.jb;
import com.yandex.div2.l9;
import com.yandex.div2.n7;
import com.yandex.div2.na;
import com.yandex.div2.nb;
import com.yandex.div2.p5;
import com.yandex.div2.r5;
import com.yandex.div2.sd;
import com.yandex.div2.v2;
import com.yandex.div2.w4;
import com.yandex.div2.yb;
import com.yandex.div2.z4;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivJsonParser.kt */
/* loaded from: classes8.dex */
public final class q6 implements Serializer, Deserializer {
    public final fe a;

    public q6(fe feVar) {
        this.a = feVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final nb deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String str;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        nb nbVar = entityTemplate instanceof nb ? (nb) entityTemplate : null;
        if (nbVar == null) {
            str = readString;
        } else if (nbVar instanceof nb.f) {
            str = "image";
        } else if (nbVar instanceof nb.d) {
            str = "gif";
        } else if (nbVar instanceof nb.p) {
            str = "text";
        } else if (nbVar instanceof nb.k) {
            str = "separator";
        } else if (nbVar instanceof nb.a) {
            str = "container";
        } else if (nbVar instanceof nb.e) {
            str = "grid";
        } else if (nbVar instanceof nb.c) {
            str = "gallery";
        } else if (nbVar instanceof nb.i) {
            str = "pager";
        } else if (nbVar instanceof nb.o) {
            str = "tabs";
        } else if (nbVar instanceof nb.m) {
            str = "state";
        } else if (nbVar instanceof nb.b) {
            str = "custom";
        } else if (nbVar instanceof nb.g) {
            str = "indicator";
        } else if (nbVar instanceof nb.l) {
            str = "slider";
        } else if (nbVar instanceof nb.n) {
            str = "switch";
        } else if (nbVar instanceof nb.h) {
            str = "input";
        } else if (nbVar instanceof nb.j) {
            str = "select";
        } else {
            if (!(nbVar instanceof nb.q)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "video";
        }
        int hashCode = str.hashCode();
        nb nbVar2 = nbVar;
        fe feVar = this.a;
        switch (hashCode) {
            case -1349088399:
                if (str.equals("custom")) {
                    return new nb.b(((h3.e) feVar.C2.getValue()).deserialize(parsingContext, (i3) (nbVar2 != null ? nbVar2.a() : null), jSONObject));
                }
                break;
            case -906021636:
                if (str.equals("select")) {
                    return new nb.j(((f9.g) feVar.B6.getValue()).deserialize(parsingContext, (j9) (nbVar2 != null ? nbVar2.a() : null), jSONObject));
                }
                break;
            case -899647263:
                if (str.equals("slider")) {
                    return new nb.l(((ga.e) feVar.f7.getValue()).deserialize(parsingContext, (ka) (nbVar2 != null ? nbVar2.a() : null), jSONObject));
                }
                break;
            case -889473228:
                if (str.equals("switch")) {
                    return new nb.n(((eb.e) feVar.M7.getValue()).deserialize(parsingContext, (fb) (nbVar2 != null ? nbVar2.a() : null), jSONObject));
                }
                break;
            case -711999985:
                if (str.equals("indicator")) {
                    return new nb.g(((p5.f) feVar.e4.getValue()).deserialize(parsingContext, (q5) (nbVar2 != null ? nbVar2.a() : null), jSONObject));
                }
                break;
            case -410956671:
                if (str.equals("container")) {
                    return new nb.a(((v2.i) feVar.n2.getValue()).deserialize(parsingContext, (x2) (nbVar2 != null ? nbVar2.a() : null), jSONObject));
                }
                break;
            case -196315310:
                if (str.equals("gallery")) {
                    return new nb.c(((w4.i) feVar.M3.getValue()).deserialize(parsingContext, (x4) (nbVar2 != null ? nbVar2.a() : null), jSONObject));
                }
                break;
            case 102340:
                if (str.equals("gif")) {
                    return new nb.d(((z4.h) feVar.P3.getValue()).deserialize(parsingContext, (a5) (nbVar2 != null ? nbVar2.a() : null), jSONObject));
                }
                break;
            case 3181382:
                if (str.equals("grid")) {
                    return new nb.e(((c5.g) feVar.S3.getValue()).deserialize(parsingContext, (d5) (nbVar2 != null ? nbVar2.a() : null), jSONObject));
                }
                break;
            case 3552126:
                if (str.equals("tabs")) {
                    return new nb.o(((jb.e) feVar.P7.getValue()).deserialize(parsingContext, (mb) (nbVar2 != null ? nbVar2.a() : null), jSONObject));
                }
                break;
            case 3556653:
                if (str.equals("text")) {
                    return new nb.p(((yb.l) feVar.v8.getValue()).deserialize(parsingContext, (wc) (nbVar2 != null ? nbVar2.a() : null), jSONObject));
                }
                break;
            case 100313435:
                if (str.equals("image")) {
                    return new nb.f(((i5.i) feVar.Y3.getValue()).deserialize(parsingContext, (j5) (nbVar2 != null ? nbVar2.a() : null), jSONObject));
                }
                break;
            case 100358090:
                if (str.equals("input")) {
                    return new nb.h(((r5.l) feVar.H4.getValue()).deserialize(parsingContext, (a6) (nbVar2 != null ? nbVar2.a() : null), jSONObject));
                }
                break;
            case 106426307:
                if (str.equals("pager")) {
                    return new nb.i(((n7.h) feVar.A5.getValue()).deserialize(parsingContext, (o7) (nbVar2 != null ? nbVar2.a() : null), jSONObject));
                }
                break;
            case 109757585:
                if (str.equals("state")) {
                    return new nb.m(((na.f) feVar.r7.getValue()).deserialize(parsingContext, (ra) (nbVar2 != null ? nbVar2.a() : null), jSONObject));
                }
                break;
            case 112202875:
                if (str.equals("video")) {
                    return new nb.q(((sd.f) feVar.r9.getValue()).deserialize(parsingContext, (yd) (nbVar2 != null ? nbVar2.a() : null), jSONObject));
                }
                break;
            case 1732829925:
                if (str.equals("separator")) {
                    return new nb.k(((l9.e) feVar.H6.getValue()).deserialize(parsingContext, (m9) (nbVar2 != null ? nbVar2.a() : null), jSONObject));
                }
                break;
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", str);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, nb nbVar) throws ParsingException {
        boolean z = nbVar instanceof nb.f;
        fe feVar = this.a;
        if (z) {
            return ((i5.i) feVar.Y3.getValue()).serialize(parsingContext, ((nb.f) nbVar).a);
        }
        if (nbVar instanceof nb.d) {
            return ((z4.h) feVar.P3.getValue()).serialize(parsingContext, ((nb.d) nbVar).a);
        }
        if (nbVar instanceof nb.p) {
            return ((yb.l) feVar.v8.getValue()).serialize(parsingContext, ((nb.p) nbVar).a);
        }
        if (nbVar instanceof nb.k) {
            return ((l9.e) feVar.H6.getValue()).serialize(parsingContext, ((nb.k) nbVar).a);
        }
        if (nbVar instanceof nb.a) {
            return ((v2.i) feVar.n2.getValue()).serialize(parsingContext, ((nb.a) nbVar).a);
        }
        if (nbVar instanceof nb.e) {
            return ((c5.g) feVar.S3.getValue()).serialize(parsingContext, ((nb.e) nbVar).a);
        }
        if (nbVar instanceof nb.c) {
            return ((w4.i) feVar.M3.getValue()).serialize(parsingContext, ((nb.c) nbVar).a);
        }
        if (nbVar instanceof nb.i) {
            return ((n7.h) feVar.A5.getValue()).serialize(parsingContext, ((nb.i) nbVar).a);
        }
        if (nbVar instanceof nb.o) {
            return ((jb.e) feVar.P7.getValue()).serialize(parsingContext, ((nb.o) nbVar).a);
        }
        if (nbVar instanceof nb.m) {
            return ((na.f) feVar.r7.getValue()).serialize(parsingContext, ((nb.m) nbVar).a);
        }
        if (nbVar instanceof nb.b) {
            return ((h3.e) feVar.C2.getValue()).serialize(parsingContext, ((nb.b) nbVar).a);
        }
        if (nbVar instanceof nb.g) {
            return ((p5.f) feVar.e4.getValue()).serialize(parsingContext, ((nb.g) nbVar).a);
        }
        if (nbVar instanceof nb.l) {
            return ((ga.e) feVar.f7.getValue()).serialize(parsingContext, ((nb.l) nbVar).a);
        }
        if (nbVar instanceof nb.n) {
            return ((eb.e) feVar.M7.getValue()).serialize(parsingContext, ((nb.n) nbVar).a);
        }
        if (nbVar instanceof nb.h) {
            return ((r5.l) feVar.H4.getValue()).serialize(parsingContext, ((nb.h) nbVar).a);
        }
        if (nbVar instanceof nb.j) {
            return ((f9.g) feVar.B6.getValue()).serialize(parsingContext, ((nb.j) nbVar).a);
        }
        if (nbVar instanceof nb.q) {
            return ((sd.f) feVar.r9.getValue()).serialize(parsingContext, ((nb.q) nbVar).a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
