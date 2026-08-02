package defpackage;

import flex.health.ErrorTypes;
import flex.logger.FlexLogLevel;
import flex.parser.FlexParserException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import just.adapter.scroll.experimental.OptimizedPaginationTriggerFeatureConfig;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes9.dex */
public final class gzp0 extends y8 {
    public static final ThreadLocal g = new ThreadLocal();
    public final z3q0 a;
    public final uyg b;
    public final seu c;
    public final KSerializer d;
    public final zjr e;
    public final SerialDescriptor f;

    public gzp0(z3q0 z3q0Var, uyg uygVar, jse jseVar, seu seuVar) {
        this.a = z3q0Var;
        this.b = uygVar;
        this.c = seuVar;
        Runtime.getRuntime().availableProcessors();
        KSerializer serializer = d0q0.Companion.serializer();
        this.d = serializer;
        this.e = new zjr(xfz.b(gzp0.class.getSimpleName()));
        this.f = serializer.getDescriptor();
    }

    public static String c(b bVar) {
        String a;
        if (!(bVar instanceof c)) {
            return null;
        }
        c cVar = (c) bVar;
        b bVar2 = (b) cVar.get("origType");
        if (bVar2 != null && (a = qcx.n(bVar2).a()) != null) {
            return a;
        }
        b bVar3 = (b) cVar.get("type");
        if (bVar3 != null) {
            return qcx.n(bVar3).a();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017e A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:11:0x0036, B:13:0x0044, B:14:0x0057, B:16:0x0061, B:17:0x006c, B:19:0x0076, B:20:0x0086, B:22:0x0090, B:23:0x00a0, B:25:0x00aa, B:26:0x00c5, B:28:0x00cb, B:31:0x00d7, B:36:0x00db, B:38:0x00e5, B:39:0x00f5, B:41:0x00fa, B:43:0x00fe, B:45:0x0107, B:47:0x010b, B:48:0x010f, B:50:0x0114, B:52:0x0118, B:53:0x011c, B:55:0x0121, B:56:0x0128, B:58:0x012c, B:60:0x0130, B:62:0x0136, B:64:0x013a, B:66:0x0140, B:68:0x0144, B:69:0x0148, B:71:0x014d, B:73:0x0156, B:79:0x0173, B:81:0x017e, B:83:0x018e, B:86:0x01a0, B:87:0x01a9, B:89:0x01af, B:92:0x01c6, B:94:0x01d9, B:96:0x01e7, B:97:0x01f2, B:104:0x015b, B:106:0x0165, B:107:0x0168, B:108:0x0170, B:117:0x01fc, B:118:0x0203), top: B:10:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d9 A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:11:0x0036, B:13:0x0044, B:14:0x0057, B:16:0x0061, B:17:0x006c, B:19:0x0076, B:20:0x0086, B:22:0x0090, B:23:0x00a0, B:25:0x00aa, B:26:0x00c5, B:28:0x00cb, B:31:0x00d7, B:36:0x00db, B:38:0x00e5, B:39:0x00f5, B:41:0x00fa, B:43:0x00fe, B:45:0x0107, B:47:0x010b, B:48:0x010f, B:50:0x0114, B:52:0x0118, B:53:0x011c, B:55:0x0121, B:56:0x0128, B:58:0x012c, B:60:0x0130, B:62:0x0136, B:64:0x013a, B:66:0x0140, B:68:0x0144, B:69:0x0148, B:71:0x014d, B:73:0x0156, B:79:0x0173, B:81:0x017e, B:83:0x018e, B:86:0x01a0, B:87:0x01a9, B:89:0x01af, B:92:0x01c6, B:94:0x01d9, B:96:0x01e7, B:97:0x01f2, B:104:0x015b, B:106:0x0165, B:107:0x0168, B:108:0x0170, B:117:0x01fc, B:118:0x0203), top: B:10:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e7 A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:11:0x0036, B:13:0x0044, B:14:0x0057, B:16:0x0061, B:17:0x006c, B:19:0x0076, B:20:0x0086, B:22:0x0090, B:23:0x00a0, B:25:0x00aa, B:26:0x00c5, B:28:0x00cb, B:31:0x00d7, B:36:0x00db, B:38:0x00e5, B:39:0x00f5, B:41:0x00fa, B:43:0x00fe, B:45:0x0107, B:47:0x010b, B:48:0x010f, B:50:0x0114, B:52:0x0118, B:53:0x011c, B:55:0x0121, B:56:0x0128, B:58:0x012c, B:60:0x0130, B:62:0x0136, B:64:0x013a, B:66:0x0140, B:68:0x0144, B:69:0x0148, B:71:0x014d, B:73:0x0156, B:79:0x0173, B:81:0x017e, B:83:0x018e, B:86:0x01a0, B:87:0x01a9, B:89:0x01af, B:92:0x01c6, B:94:0x01d9, B:96:0x01e7, B:97:0x01f2, B:104:0x015b, B:106:0x0165, B:107:0x0168, B:108:0x0170, B:117:0x01fc, B:118:0x0203), top: B:10:0x0036 }] */
    @Override // defpackage.y8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sbx sbxVar, b bVar) {
        String str;
        StackTraceElement stackTraceElement;
        String str2;
        String str3;
        OptimizedPaginationTriggerFeatureConfig optimizedPaginationTriggerFeatureConfig;
        xyp0 xyp0Var;
        LinkedHashMap linkedHashMap;
        wzp0 wzp0Var;
        wzp0 wzp0Var2;
        wzp0 wzp0Var3;
        zzp0 zzp0Var;
        Boolean bool;
        Boolean bool2;
        u1m u1mVar;
        w1m w1mVar = (w1m) bvf0.A(sbxVar).c(qoi0.a(w1m.class));
        if (w1mVar == null || (u1mVar = w1mVar.a) == null || (str = u1mVar.a) == null) {
            str = "api/screen/unknown";
        }
        e7j0 e7j0Var = (e7j0) bvf0.A(sbxVar).c(qoi0.a(e7j0.class));
        String str4 = e7j0Var != null ? e7j0Var.a : null;
        try {
            c m = qcx.m(bVar);
            b bVar2 = (b) m.get("settings");
            c0q0 c0q0Var = bVar2 != null ? (c0q0) sbxVar.a(c0q0.Companion.serializer(), bVar2) : null;
            b bVar3 = (b) m.get("nextPageToken");
            String g2 = bVar3 != null ? qcx.g(qcx.n(bVar3)) : null;
            b bVar4 = (b) m.get("actions");
            mzp0 mzp0Var = bVar4 != null ? (mzp0) sbxVar.a(mzp0.Companion.serializer(), bVar4) : null;
            b bVar5 = (b) m.get("animations");
            pzp0 pzp0Var = bVar5 != null ? (pzp0) sbxVar.a(pzp0.Companion.serializer(), bVar5) : null;
            b bVar6 = (b) m.get("sections");
            if (bVar6 == null) {
                throw new Exception("Missing sections list data for key: sections");
            }
            a l = qcx.l(qcx.l(bVar6));
            ArrayList arrayList = new ArrayList();
            Iterator it = l.a.iterator();
            while (it.hasNext()) {
                pyp0 b = b(sbxVar, (b) it.next(), str, str4);
                if (b != null) {
                    arrayList.add(b);
                }
            }
            b bVar7 = (b) m.get("loadingSettings");
            tzp0 tzp0Var = bVar7 != null ? (tzp0) sbxVar.a(tzp0.Companion.serializer(), bVar7) : null;
            boolean z = true;
            boolean booleanValue = (c0q0Var == null || (bool2 = c0q0Var.a) == null) ? true : bool2.booleanValue();
            if (c0q0Var != null && (bool = c0q0Var.b) != null) {
                z = bool.booleanValue();
            }
            boolean z2 = z;
            bzp0 bzp0Var = new bzp0((c0q0Var == null || (zzp0Var = c0q0Var.c) == null) ? null : zzp0Var.a);
            Boolean bool3 = c0q0Var != null ? c0q0Var.d : null;
            azp0 azp0Var = new azp0((c0q0Var == null || (wzp0Var3 = c0q0Var.e) == null) ? null : wzp0Var3.a, (c0q0Var == null || (wzp0Var2 = c0q0Var.e) == null) ? null : wzp0Var2.b, (c0q0Var == null || (wzp0Var = c0q0Var.e) == null) ? null : wzp0Var.c);
            Boolean bool4 = c0q0Var != null ? c0q0Var.f : null;
            if (c0q0Var != null) {
                optimizedPaginationTriggerFeatureConfig = c0q0Var.i;
                if (optimizedPaginationTriggerFeatureConfig == null) {
                    optimizedPaginationTriggerFeatureConfig = jl40.l(c0q0Var.h, Boolean.TRUE) ? OptimizedPaginationTriggerFeatureConfig.ENABLED_AUTOMATIC_TRIGGER : OptimizedPaginationTriggerFeatureConfig.DISABLED;
                }
                if (optimizedPaginationTriggerFeatureConfig == null) {
                }
                czp0 czp0Var = new czp0(booleanValue, z2, bzp0Var, bool3, azp0Var, bool4, null, optimizedPaginationTriggerFeatureConfig);
                if (mzp0Var == null) {
                    kr krVar = mzp0Var.a;
                    kr krVar2 = mzp0Var.b;
                    kr krVar3 = mzp0Var.c;
                    kr krVar4 = mzp0Var.d;
                    kr krVar5 = mzp0Var.e;
                    kr krVar6 = mzp0Var.f;
                    List list = mzp0Var.g;
                    if (list != null) {
                        List list2 = list;
                        int d = gw00.d(tcc.n(list2, 10));
                        if (d < 16) {
                            d = 16;
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(d);
                        for (Object obj : list2) {
                            linkedHashMap2.put(((j2q0) obj).b(), obj);
                        }
                        linkedHashMap = linkedHashMap2;
                    } else {
                        linkedHashMap = null;
                    }
                    xyp0Var = new xyp0(krVar, krVar2, krVar3, krVar4, krVar5, krVar6, linkedHashMap);
                } else {
                    xyp0Var = null;
                }
                return new dzp0(czp0Var, arrayList, g2, xyp0Var, pzp0Var == null ? new yyp0(pzp0Var.a, pzp0Var.b) : null, tzp0Var == null ? new zyp0(tzp0Var.a, tzp0Var.b) : null);
            }
            optimizedPaginationTriggerFeatureConfig = OptimizedPaginationTriggerFeatureConfig.DISABLED;
            czp0 czp0Var2 = new czp0(booleanValue, z2, bzp0Var, bool3, azp0Var, bool4, null, optimizedPaginationTriggerFeatureConfig);
            if (mzp0Var == null) {
            }
            return new dzp0(czp0Var2, arrayList, g2, xyp0Var, pzp0Var == null ? new yyp0(pzp0Var.a, pzp0Var.b) : null, tzp0Var == null ? new zyp0(tzp0Var.a, tzp0Var.b) : null);
        } catch (Throwable th) {
            nez nezVar = (nez) bvf0.A(sbxVar).c(qoi0.a(nez.class));
            zjr zjrVar = this.e;
            if (nezVar != null && (str3 = nezVar.a) != null) {
                zjrVar.f(str3);
            }
            if (this.c != null) {
                ErrorTypes.CORRUPTED_CONTENT.getClass();
                gw00.e(new Pair("type", "section"));
            }
            String type = ErrorTypes.CORRUPTED_CONTENT.getType();
            i3y a = xfz.a(new Pair("locator", "SectionContentParser.parse"), new Pair("cause", th), new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, oyr.p("Content corrupted: failed to parse content (", th.getMessage(), Extension.C_BRAKE)), new Pair("contentType", "section"));
            s7s0 s7s0Var = zjrVar.c.a;
            boolean booleanValue2 = Boolean.FALSE.booleanValue();
            tjr tjrVar = tjr.d;
            if (booleanValue2 && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
                String fileName = stackTraceElement.getFileName();
                if (fileName == null) {
                    fileName = "No file info";
                }
                String methodName = stackTraceElement.getMethodName();
                int lineNumber = stackTraceElement.getLineNumber();
                Integer valueOf = lineNumber > 0 ? Integer.valueOf(lineNumber) : null;
                if (valueOf == null || (str2 = valueOf.toString()) == null) {
                    str2 = "No line info";
                }
                tjrVar = new tjr(fileName, methodName, str2);
            }
            zjrVar.d(FlexLogLevel.FAULT, "Failed to parse content", xfz.c(a, xfz.a(new Pair("errorType", type))), EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
            throw new FlexParserException(new lyg("Failed to parse content due to exception", th, 16));
        }
    }

    public final pyp0 b(sbx sbxVar, b bVar, String str, String str2) {
        StackTraceElement stackTraceElement;
        String str3;
        String str4;
        b bVar2;
        String str5;
        b bVar3;
        String c;
        try {
            String uuid = UUID.randomUUID().toString();
            c cVar = bVar instanceof c ? (c) bVar : null;
            if (cVar == null || (c = c(cVar)) == null) {
                str5 = null;
            } else {
                str5 = c + Extension.DOT_CHAR + str;
            }
            uyg uygVar = this.b;
            if (str5 != null && uygVar != null) {
                uygVar.startDecodingSection(str5, uuid);
            }
            String valueOf = String.valueOf((cVar == null || (bVar3 = (b) cVar.get("type")) == null) ? null : qcx.n(bVar3).a());
            KSerializer select = new r3k0(7, this, valueOf).select(valueOf);
            if (select == null) {
                return d(sbxVar, valueOf, cVar);
            }
            Object a = sbxVar.a(select, bVar);
            if (str5 != null && uygVar != null) {
                uygVar.endDecodingSection(str5, uuid, str, gw00.e(new Pair("reqId", str2)));
            }
            return (pyp0) a;
        } catch (Exception e) {
            String a2 = (!(bVar instanceof c) || (bVar2 = (b) ((c) bVar).get("id")) == null) ? null : qcx.n(bVar2).a();
            String c2 = c(bVar);
            String a3 = k791.a(e);
            if (a3 == null) {
                a3 = "неизвестная ошибка";
            }
            nez nezVar = (nez) bvf0.A(sbxVar).c(qoi0.a(nez.class));
            zjr zjrVar = this.e;
            if (nezVar != null && (str4 = nezVar.a) != null) {
                zjrVar.f(str4);
            }
            if (this.c != null) {
                ErrorTypes.CORRUPTED_SECTION.getClass();
                kotlin.collections.b.i(new Pair("section_id", a2 == null ? "" : a2), new Pair("type", c2 != null ? c2 : ""));
            }
            String type = ErrorTypes.CORRUPTED_SECTION.getType();
            i3y a4 = xfz.a(new Pair("locator", "SectionContentParser.parse"), new Pair("cause", e), xfz.d(a2, "section_id"), xfz.d(c2, "type"), new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, oyr.p("Section corrupted: failed to parse section (", e.getMessage(), Extension.C_BRAKE)));
            s7s0 s7s0Var = zjrVar.c.a;
            boolean booleanValue = Boolean.FALSE.booleanValue();
            tjr tjrVar = tjr.d;
            if (booleanValue && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
                String fileName = stackTraceElement.getFileName();
                if (fileName == null) {
                    fileName = "No file info";
                }
                String methodName = stackTraceElement.getMethodName();
                int lineNumber = stackTraceElement.getLineNumber();
                Integer valueOf2 = lineNumber > 0 ? Integer.valueOf(lineNumber) : null;
                if (valueOf2 == null || (str3 = valueOf2.toString()) == null) {
                    str3 = "No line info";
                }
                tjrVar = new tjr(fileName, methodName, str3);
            }
            zjrVar.d(FlexLogLevel.ERROR, "Failed to parse section", xfz.c(a4, xfz.a(new Pair("errorType", type))), EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
            hns0 hns0Var = (hns0) bvf0.A(sbxVar).c(qoi0.a(hns0.class));
            if (hns0Var != null) {
                String message = e.getMessage();
                if (message == null) {
                    message = unr0.p("Failed to parse section (id = '", a2, "', type = '", c2, "').");
                }
                hns0Var.a.add(new lyg(message, c2, a2, e));
            }
            return new pwg(unr0.p("Произошла ошибка во время парсинга секции типа '", c2, "' (", a3, Extension.C_BRAKE), sbxVar.c(bVar, b.Companion.serializer()));
        }
    }

    public final pwg d(sbx sbxVar, String str, c cVar) {
        StackTraceElement stackTraceElement;
        String str2;
        b bVar;
        String str3;
        nez nezVar = (nez) bvf0.A(sbxVar).c(qoi0.a(nez.class));
        zjr zjrVar = this.e;
        if (nezVar != null && (str3 = nezVar.a) != null) {
            zjrVar.f(str3);
        }
        String a = (cVar == null || (bVar = (b) cVar.get("id")) == null) ? null : qcx.n(bVar).a();
        if (this.c != null) {
            ErrorTypes.UNSUPPORTED_SECTION.getClass();
            kotlin.collections.b.i(new Pair("section_id", a == null ? "" : a), new Pair("type", str));
        }
        String type = ErrorTypes.UNSUPPORTED_SECTION.getType();
        i3y a2 = xfz.a(new Pair("locator", "SectionContentParser.parse"), xfz.d(a, "section_id"), new Pair("type", str));
        s7s0 s7s0Var = zjrVar.c.a;
        boolean booleanValue = Boolean.FALSE.booleanValue();
        tjr tjrVar = tjr.d;
        if (booleanValue && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
            String fileName = stackTraceElement.getFileName();
            if (fileName == null) {
                fileName = "No file info";
            }
            String methodName = stackTraceElement.getMethodName();
            int lineNumber = stackTraceElement.getLineNumber();
            Integer valueOf = lineNumber > 0 ? Integer.valueOf(lineNumber) : null;
            if (valueOf == null || (str2 = valueOf.toString()) == null) {
                str2 = "No line info";
            }
            tjrVar = new tjr(fileName, methodName, str2);
        }
        zjrVar.d(FlexLogLevel.WARNING, "Section is unsupported", xfz.c(a2, xfz.a(new Pair("errorType", type))), EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
        hns0 hns0Var = (hns0) bvf0.A(sbxVar).c(qoi0.a(hns0.class));
        if (hns0Var != null) {
            hns0.b(hns0Var, oyr.p("Failed to parse action. Type ", str, " is not supported."), str, a, 16);
        }
        return new pwg(oyr.p("Не удалось распарсить секцию типа '", str, "': тип секции не поддержан в приложении"), sbxVar.c(cVar, qke.n(c.Companion.serializer())));
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.f;
    }
}
