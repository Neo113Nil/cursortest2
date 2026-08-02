package com.pichillilorenzo.flutter_inappwebview_android.types;

import android.print.PrintJobInfo;
import defpackage.tse0;
import java.util.HashMap;
import java.util.Map;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes11.dex */
public class PrintJobInfoExt {
    private PrintAttributesExt attributes;
    private int copies;
    private long creationTime;
    private String label;
    private Integer numberOfPages;
    private String printerId;
    private int state;

    public static PrintJobInfoExt fromPrintJobInfo(PrintJobInfo printJobInfo) {
        if (printJobInfo == null) {
            return null;
        }
        PrintJobInfoExt printJobInfoExt = new PrintJobInfoExt();
        printJobInfoExt.state = printJobInfo.getState();
        printJobInfoExt.copies = printJobInfo.getCopies();
        printJobInfoExt.numberOfPages = printJobInfo.getPages() != null ? Integer.valueOf(printJobInfo.getPages().length) : null;
        printJobInfoExt.creationTime = printJobInfo.getCreationTime();
        printJobInfoExt.label = printJobInfo.getLabel();
        printJobInfoExt.printerId = printJobInfo.getPrinterId() != null ? printJobInfo.getPrinterId().getLocalId() : null;
        printJobInfoExt.attributes = PrintAttributesExt.fromPrintAttributes(printJobInfo.getAttributes());
        return printJobInfoExt;
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put(ClidProvider.STATE, Integer.valueOf(this.state));
        hashMap.put("copies", Integer.valueOf(this.copies));
        hashMap.put("numberOfPages", this.numberOfPages);
        hashMap.put("creationTime", Long.valueOf(this.creationTime));
        HashMap r = tse0.r("label", hashMap, this.label);
        r.put("id", this.printerId);
        hashMap.put("printer", r);
        PrintAttributesExt printAttributesExt = this.attributes;
        hashMap.put("attributes", printAttributesExt != null ? printAttributesExt.toMap() : null);
        return hashMap;
    }
}
