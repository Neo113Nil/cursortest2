package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import javax.xml.crypto.dom.DOMStructure;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeDecoder;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.XAdES.SigAndRefsTimeStampImpl;
import ru.CryptoPro.XAdES.XAdESParameters;
import ru.CryptoPro.XAdES.XAdESType;
import ru.CryptoPro.XAdES.cl_64;
import ru.CryptoPro.XAdES.exception.XAdESException;
import ru.CryptoPro.XAdES.util.XMLUtils;

/* loaded from: classes4.dex */
public final class lw61 extends bv61 implements AdESXLongType1AttributeDecoder {
    public final LinkedList B;
    public final LinkedList C;
    public final LinkedList D;
    public v2k0 E;

    public lw61(Element element) {
        super(element);
        this.B = new LinkedList();
        this.C = new LinkedList();
        this.D = new LinkedList();
        this.E = null;
    }

    @Override // defpackage.bv61, defpackage.tr61, defpackage.jt61, ru.CryptoPro.AdES.external.decode.AdESAttributeDecoder, ru.CryptoPro.AdES.external.decode.AdESBESAttributeDecoder, ru.CryptoPro.AdES.external.decode.AdESTAttributeDecoder
    public final void decode() {
        sr61 sr61Var;
        List list;
        v2k0 v2k0Var;
        Element f;
        Element f2;
        JCPLogger.subEnter();
        JCPLogger.fine("Decoding as XAdES-X Long Type 1 structure...");
        super.decode();
        JCPLogger.fine("Normalizing references, certificates and evidences...");
        sr61 sr61Var2 = new sr61();
        sr61Var2.x = this.b;
        sr61Var2.A = this;
        LinkedList linkedList = sr61Var2.z;
        LinkedList linkedList2 = sr61Var2.y;
        JCPLogger.subEnter();
        JCPLogger.fine("Obtaining references, certificates and evidences...");
        cl_64 cl_64Var = cl_64.A;
        TreeMap treeMap = this.y;
        dr61 dr61Var = (dr61) treeMap.get(cl_64Var);
        if (dr61Var == null) {
            dr61Var = (dr61) treeMap.get(cl_64.B);
        }
        if (dr61Var == null) {
            throw new XAdESException("complete-certificate-reference is undefined.", IAdESException.ecNodeNotFound);
        }
        ft61 a = dr61Var.a();
        if (a == null) {
            throw new XAdESException("CertRefs is undefined.", IAdESException.ecNodeNotFound);
        }
        if (a.y == null) {
            List<Element> childElementsByTagNameNS = XMLUtils.getChildElementsByTagNameNS(a.e(), "Cert", XAdESParameters.XADES_SIGNATURE_NAMESPACE);
            if (childElementsByTagNameNS == null || childElementsByTagNameNS.size() <= 0) {
                a.y = Collections.EMPTY_LIST;
            } else {
                a.y = new ArrayList(childElementsByTagNameNS.size());
                Iterator<Element> it = childElementsByTagNameNS.iterator();
                while (it.hasNext()) {
                    a.y.add(new rv61(it.next(), XAdESParameters.XADES_SIGNATURE_PREFIX, XAdESParameters.XADES_SIGNATURE_NAMESPACE, a.w));
                }
            }
        }
        List list2 = a.y;
        if (list2.isEmpty()) {
            throw new XAdESException("Certificate references not found in CertRefs.", IAdESException.ecNodeNotFound);
        }
        cs61 cs61Var = (cs61) treeMap.get(cl_64.C);
        if (cs61Var == null) {
            cs61Var = (cs61) treeMap.get(cl_64.D);
        }
        if (cs61Var == null) {
            throw new XAdESException("complete-revocation-reference is undefined.", IAdESException.ecNodeNotFound);
        }
        hs61 hs61Var = (hs61) cs61Var;
        if (hs61Var.y == null) {
            Element f3 = hs61Var.f("CRLRefs");
            hs61Var.y = f3 != null ? new ft61(f3, hs61Var.b, hs61Var.c, hs61Var.w, 0).h() : Collections.EMPTY_LIST;
        }
        List list3 = hs61Var.y;
        if (hs61Var.x == null) {
            Element f4 = hs61Var.f("OCSPRefs");
            hs61Var.x = f4 != null ? new ft61(f4, hs61Var.b, hs61Var.c, hs61Var.w, 1).h() : Collections.EMPTY_LIST;
        }
        List list4 = hs61Var.x;
        qx61 qx61Var = (qx61) treeMap.get(cl_64.G);
        if (qx61Var == null) {
            throw new XAdESException("certificate-values is undefined.", IAdESException.ecNodeNotFound);
        }
        List h = ((ux61) qx61Var).h();
        LinkedList linkedList3 = sr61Var2.c;
        linkedList3.addAll(h);
        AdESXLongType1AttributeDecoder adESXLongType1AttributeDecoder = sr61Var2.A;
        if (adESXLongType1AttributeDecoder != null && (adESXLongType1AttributeDecoder instanceof kq61)) {
            linkedList3.addAll(Collections.unmodifiableSet(((jt61) ((kq61) adESXLongType1AttributeDecoder)).c));
        }
        su61 su61Var = (su61) treeMap.get(cl_64.H);
        if (su61Var == null) {
            throw new XAdESException("revocation-values is undefined.", IAdESException.ecNodeNotFound);
        }
        if (su61Var.y == null && (f2 = su61Var.f("OCSPValues")) != null) {
            su61Var.y = new pu61(f2, su61Var.b, su61Var.c, su61Var.w);
        }
        pu61 pu61Var = su61Var.y;
        HashSet hashSet = new HashSet();
        if (pu61Var != null) {
            if (pu61Var.x == null) {
                pu61Var.x = new HashSet();
                List<Element> childElementsByTagNameNS2 = XMLUtils.getChildElementsByTagNameNS(pu61Var.e(), "EncapsulatedOCSPValue", pu61Var.c);
                if (!childElementsByTagNameNS2.isEmpty()) {
                    Iterator<Element> it2 = childElementsByTagNameNS2.iterator();
                    while (it2.hasNext()) {
                        pu61Var.x.add(new ht61(it2.next(), pu61Var.b, pu61Var.c, pu61Var.w));
                        sr61Var2 = sr61Var2;
                        list4 = list4;
                    }
                }
            }
            sr61Var = sr61Var2;
            list = list4;
            hashSet.addAll(Collections.unmodifiableSet(pu61Var.x));
        } else {
            sr61Var = sr61Var2;
            list = list4;
        }
        if (su61Var.x == null && (f = su61Var.f("CRLValues")) != null) {
            su61Var.x = new pu61(f, su61Var.b, su61Var.c, su61Var.w);
        }
        pu61 pu61Var2 = su61Var.x;
        HashSet hashSet2 = new HashSet();
        if (pu61Var2 != null) {
            if (pu61Var2.x == null) {
                pu61Var2.x = new HashSet();
                List<Element> childElementsByTagNameNS3 = XMLUtils.getChildElementsByTagNameNS(pu61Var2.e(), "EncapsulatedCRLValue", pu61Var2.c);
                if (!childElementsByTagNameNS3.isEmpty()) {
                    Iterator<Element> it3 = childElementsByTagNameNS3.iterator();
                    while (it3.hasNext()) {
                        pu61Var2.x.add(new ys61(it3.next(), pu61Var2.b, pu61Var2.c, pu61Var2.w));
                    }
                }
            }
            hashSet2.addAll(Collections.unmodifiableSet(pu61Var2.x));
        }
        JCPLogger.fine("Extracting signing certificate reference...");
        bw61 bw61Var = (bw61) treeMap.get(cl_64.f);
        if (bw61Var == null) {
            JCPLogger.fine("Extracting signing certificate V2 reference...");
            bw61Var = (fw61) treeMap.get(cl_64.g);
        }
        if (bw61Var == null) {
            throw new XAdESException("Signing certificate is undefined.", IAdESException.ecNodeNotFound);
        }
        cr80 a2 = bw61Var.a();
        try {
            linkedList2.clear();
            linkedList.clear();
            JCPLogger.fine("Normalization for signer certificate...");
            sr61 sr61Var3 = sr61Var;
            List list5 = list;
            sr61Var3.a(a2, list5, list3, hashSet, hashSet2);
            Iterator it4 = list2.iterator();
            while (it4.hasNext()) {
                cr80 h2 = rv61.h((rv61) it4.next());
                JCPLogger.fine("Normalization of other certificate...");
                sr61Var3.a(h2, list5, list3, hashSet, hashSet2);
            }
            if (linkedList2.isEmpty() || linkedList.isEmpty()) {
                if (!linkedList2.isEmpty()) {
                    sr61Var3.w = new v2k0(null, (he5[]) linkedList2.toArray(new he5[linkedList2.size()]));
                } else if (!linkedList.isEmpty()) {
                    v2k0Var = new v2k0((m79[]) linkedList.toArray(new m79[linkedList.size()]), null);
                }
                JCPLogger.subExit();
                this.B.addAll(Collections.unmodifiableList(sr61Var3.a));
                this.C.addAll(Collections.unmodifiableList(sr61Var3.b));
                this.D.addAll(Collections.unmodifiableList(linkedList3));
                this.E = sr61Var3.w;
                JCPLogger.fine("Normalization completed.");
                JCPLogger.subExit();
            }
            v2k0Var = new v2k0((m79[]) linkedList.toArray(new m79[linkedList.size()]), (he5[]) linkedList2.toArray(new he5[linkedList2.size()]));
            sr61Var3.w = v2k0Var;
            JCPLogger.subExit();
            this.B.addAll(Collections.unmodifiableList(sr61Var3.a));
            this.C.addAll(Collections.unmodifiableList(sr61Var3.b));
            this.D.addAll(Collections.unmodifiableList(linkedList3));
            this.E = sr61Var3.w;
            JCPLogger.fine("Normalization completed.");
            JCPLogger.subExit();
        } catch (AdESException e) {
            throw new XAdESException(e, e.getErrorCode());
        } catch (Exception e2) {
            throw new XAdESException(e2, IAdESException.ecNormalizingFailed);
        }
    }

    @Override // ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeDecoder, ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeParametersDecoder
    public final List getCertificateValues() {
        return Collections.unmodifiableList(this.D);
    }

    @Override // ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeDecoder, ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeParametersDecoder
    public final List getCompleteCertificateReferences() {
        return Collections.unmodifiableList(this.B);
    }

    @Override // ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeDecoder, ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeParametersDecoder
    public final List getCompleteRevocationReferences() {
        return Collections.unmodifiableList(this.C);
    }

    @Override // ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeDecoder, ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeParametersDecoder
    public final v2k0 getRevocationValues() {
        return this.E;
    }

    @Override // defpackage.bv61, defpackage.tr61
    public final void h() {
        cl_64[] cl_64VarArr;
        DOMStructure arrayList;
        cl_64 cl_64Var;
        ArrayList arrayList2;
        cl_64 cl_64Var2;
        JCPLogger.subEnter();
        qu61 a = XAdESType.a(this.x);
        if (a != null) {
            try {
                Element e = a.e();
                cl_64[] values = cl_64.values();
                int length = values.length;
                int i = 0;
                while (i < length) {
                    cl_64 cl_64Var3 = values[i];
                    NodeList elementsByTagNameNS = e.getElementsByTagNameNS(XAdESParameters.XADES_SIGNATURE_NAMESPACE, cl_64Var3.b());
                    rvr rvrVar = bv61.A;
                    HashSet hashSet = this.c;
                    TreeMap treeMap = this.y;
                    if (elementsByTagNameNS == null || elementsByTagNameNS.getLength() <= 0) {
                        cl_64VarArr = values;
                        NodeList elementsByTagNameNS2 = e.getElementsByTagNameNS(XAdESParameters.XADES141_SIGNATURE_NAMESPACE, cl_64Var3.b());
                        if (elementsByTagNameNS2 != null && elementsByTagNameNS2.getLength() > 0) {
                            cl_64 cl_64Var4 = cl_64.B;
                            if (cl_64Var4.equals(cl_64Var3)) {
                                treeMap.put(cl_64Var4, new rr61(elementsByTagNameNS2.item(0), XAdESParameters.XML_SIGNATURE_PREFIX));
                            } else if (cl_64.L.equals(cl_64Var3)) {
                                arrayList = new ArrayList();
                                for (int i2 = 0; i2 < elementsByTagNameNS2.getLength(); i2++) {
                                    yu61 yu61Var = new yu61(elementsByTagNameNS2.item(i2), XAdESParameters.XADES141_SIGNATURE_PREFIX, XAdESParameters.XADES141_SIGNATURE_NAMESPACE, XAdESParameters.XML_SIGNATURE_PREFIX);
                                    yu61Var.setProvider(this.b);
                                    yu61Var.setCertificateValues(hashSet);
                                    arrayList.add(yu61Var);
                                }
                                Collections.sort(arrayList, rvrVar);
                                cl_64Var = cl_64.L;
                                treeMap.put(cl_64Var, arrayList);
                            }
                        }
                    } else if (cl_64.z.equals(cl_64Var3)) {
                        ArrayList arrayList3 = new ArrayList();
                        int i3 = 0;
                        while (i3 < elementsByTagNameNS.getLength()) {
                            st61 st61Var = new st61(elementsByTagNameNS.item(i3), XAdESParameters.XADES_SIGNATURE_PREFIX, XAdESParameters.XADES_SIGNATURE_NAMESPACE, XAdESParameters.XML_SIGNATURE_PREFIX);
                            st61Var.setProvider(this.b);
                            st61Var.setCertificateValues(hashSet);
                            arrayList3.add(st61Var);
                            i3++;
                            values = values;
                        }
                        cl_64VarArr = values;
                        Collections.sort(arrayList3, rvrVar);
                        treeMap.put(cl_64.z, arrayList3);
                    } else {
                        cl_64VarArr = values;
                        if (cl_64.K.equals(cl_64Var3)) {
                            arrayList2 = new ArrayList();
                            for (int i4 = 0; i4 < elementsByTagNameNS.getLength(); i4++) {
                                SigAndRefsTimeStampImpl sigAndRefsTimeStampImpl = new SigAndRefsTimeStampImpl(elementsByTagNameNS.item(i4), XAdESParameters.XML_SIGNATURE_PREFIX);
                                sigAndRefsTimeStampImpl.setProvider(this.b);
                                sigAndRefsTimeStampImpl.setCertificateValues(hashSet);
                                arrayList2.add(sigAndRefsTimeStampImpl);
                            }
                            Collections.sort(arrayList2, rvrVar);
                            cl_64Var2 = cl_64.K;
                        } else if (cl_64.L.equals(cl_64Var3)) {
                            arrayList2 = new ArrayList();
                            for (int i5 = 0; i5 < elementsByTagNameNS.getLength(); i5++) {
                                yu61 yu61Var2 = new yu61(elementsByTagNameNS.item(i5), XAdESParameters.XADES_SIGNATURE_PREFIX, XAdESParameters.XADES_SIGNATURE_NAMESPACE, XAdESParameters.XML_SIGNATURE_PREFIX);
                                yu61Var2.setProvider(this.b);
                                yu61Var2.setCertificateValues(hashSet);
                                arrayList2.add(yu61Var2);
                            }
                            Collections.sort(arrayList2, rvrVar);
                            cl_64Var2 = cl_64.L;
                        } else {
                            cl_64Var = cl_64.A;
                            if (cl_64Var.equals(cl_64Var3)) {
                                arrayList = new lr61(elementsByTagNameNS.item(0), XAdESParameters.XML_SIGNATURE_PREFIX);
                            } else {
                                cl_64Var = cl_64.B;
                                if (cl_64Var.equals(cl_64Var3)) {
                                    arrayList = new rr61(elementsByTagNameNS.item(0), XAdESParameters.XADES_SIGNATURE_PREFIX, XAdESParameters.XADES_SIGNATURE_NAMESPACE, XAdESParameters.XML_SIGNATURE_PREFIX);
                                } else {
                                    cl_64Var = cl_64.C;
                                    if (cl_64Var.equals(cl_64Var3)) {
                                        arrayList = new hs61(elementsByTagNameNS.item(0), XAdESParameters.XADES_SIGNATURE_PREFIX, XAdESParameters.XADES_SIGNATURE_NAMESPACE, XAdESParameters.XML_SIGNATURE_PREFIX);
                                    } else {
                                        cl_64Var = cl_64.G;
                                        if (cl_64Var.equals(cl_64Var3)) {
                                            arrayList = new ux61(elementsByTagNameNS.item(0), XAdESParameters.XADES_SIGNATURE_PREFIX, XAdESParameters.XADES_SIGNATURE_NAMESPACE, XAdESParameters.XML_SIGNATURE_PREFIX);
                                        } else {
                                            cl_64Var = cl_64.H;
                                            if (cl_64Var.equals(cl_64Var3)) {
                                                arrayList = new su61(elementsByTagNameNS.item(0), XAdESParameters.XADES_SIGNATURE_PREFIX, XAdESParameters.XADES_SIGNATURE_NAMESPACE, XAdESParameters.XML_SIGNATURE_PREFIX);
                                            }
                                        }
                                    }
                                }
                            }
                            treeMap.put(cl_64Var, arrayList);
                        }
                        treeMap.put(cl_64Var2, arrayList2);
                    }
                    i++;
                    values = cl_64VarArr;
                }
            } catch (XAdESException e2) {
                throw e2;
            } catch (Exception e3) {
                throw new XAdESException(e3, IAdESException.ecSignatureMarshallingFailed);
            }
        }
        JCPLogger.subExit();
    }

    public final List i() {
        cl_64 cl_64Var = cl_64.K;
        TreeMap treeMap = this.y;
        List list = (List) treeMap.get(cl_64Var);
        return list == null ? (List) treeMap.get(cl_64.L) : list;
    }

    @Override // ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeDecoder, ru.CryptoPro.AdES.external.decode.ParentalDecoder
    public final void setParentalDecoder(AdESXLongType1AttributeDecoder adESXLongType1AttributeDecoder) {
    }
}
