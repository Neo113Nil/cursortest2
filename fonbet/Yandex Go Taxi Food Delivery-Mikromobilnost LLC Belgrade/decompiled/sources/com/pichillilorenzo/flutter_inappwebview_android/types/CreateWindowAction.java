package com.pichillilorenzo.flutter_inappwebview_android.types;

import defpackage.unr0;
import java.util.Map;

/* loaded from: classes11.dex */
public class CreateWindowAction extends NavigationAction {
    boolean isDialog;
    int windowId;

    public CreateWindowAction(URLRequest uRLRequest, boolean z, boolean z2, boolean z3, int i, boolean z4) {
        super(uRLRequest, z, z2, z3);
        this.windowId = i;
        this.isDialog = z4;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.NavigationAction
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        CreateWindowAction createWindowAction = (CreateWindowAction) obj;
        return this.windowId == createWindowAction.windowId && this.isDialog == createWindowAction.isDialog;
    }

    public int getWindowId() {
        return this.windowId;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.NavigationAction
    public int hashCode() {
        return (((super.hashCode() * 31) + this.windowId) * 31) + (this.isDialog ? 1 : 0);
    }

    public boolean isDialog() {
        return this.isDialog;
    }

    public void setDialog(boolean z) {
        this.isDialog = z;
    }

    public void setWindowId(int i) {
        this.windowId = i;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.NavigationAction
    public Map<String, Object> toMap() {
        Map<String, Object> map = super.toMap();
        map.put("windowId", Integer.valueOf(this.windowId));
        map.put("isDialog", Boolean.valueOf(this.isDialog));
        map.put("windowFeatures", null);
        return map;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.NavigationAction
    public String toString() {
        StringBuilder sb = new StringBuilder("CreateWindowAction{windowId=");
        sb.append(this.windowId);
        sb.append(", isDialog=");
        sb.append(this.isDialog);
        sb.append(", request=");
        sb.append(this.request);
        sb.append(", isForMainFrame=");
        sb.append(this.isForMainFrame);
        sb.append(", hasGesture=");
        sb.append(this.hasGesture);
        sb.append(", isRedirect=");
        return unr0.u(sb, this.isRedirect, '}');
    }
}
