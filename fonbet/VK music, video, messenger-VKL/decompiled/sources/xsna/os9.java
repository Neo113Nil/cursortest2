package xsna;

import android.content.SharedPreferences;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.SortedSet;
import com.vk.catalog2.common.ui.mvp.auto.VKAndroidAutoCatalogMediaService;
import com.vk.core.compose.component.modal.SheetValue;
import com.vk.core.preference.Preference;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.pending.PendingPhotoAttachment;
import com.vk.writebar.WriteBar;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: CarConnection.java */
/* loaded from: classes11.dex */
public final class os9 implements pjw, g94 {
    public final /* synthetic */ int b;
    public final Object c;

    public /* synthetic */ os9(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    public void a(LayoutNode layoutNode) {
        if (!layoutNode.e()) {
            uzw.b("DepthSortedSet.add called on an unattached node");
        }
        ((SortedSet) this.c).add(layoutNode);
    }

    public void b(SheetValue sheetValue, float f) {
        ((LinkedHashMap) this.c).put(sheetValue, Float.valueOf(f));
    }

    public SharedPreferences c() {
        return Preference.e(((UserId) ((gzs) this.c).invoke()).b, "ChangeNameStorage");
    }

    @Override // xsna.g94
    public int d(Attachment attachment) {
        return -1;
    }

    public void e(final View view, View view2, View view3) {
        final ArrayList a = e43.a(view2, view3);
        final int a2 = gbg0.a(view.getResources(), 16.0f);
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        bwt0.h(view, new gzs() { // from class: xsna.ybg
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0084 A[LOOP:2: B:26:0x0082->B:27:0x0084, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:31:0x009c A[LOOP:3: B:30:0x009a->B:31:0x009c, LOOP_END] */
            /* JADX WARN: Type inference failed for: r3v3, types: [T, android.view.TouchDelegate, xsna.tui] */
            @Override // xsna.gzs
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                int size;
                int i;
                int size2;
                ArrayList arrayList = (ArrayList) this.c;
                ArrayList arrayList2 = a;
                int size3 = arrayList2.size();
                for (int i2 = 0; i2 < size3; i2++) {
                    if (arrayList.size() <= i2) {
                        arrayList.add(new Rect());
                    }
                    ((View) arrayList2.get(i2)).getHitRect((Rect) arrayList.get(i2));
                    Rect rect = (Rect) arrayList.get(i2);
                    int i3 = -a2;
                    rect.inset(i3, i3);
                }
                Ref$ObjectRef ref$ObjectRef2 = ref$ObjectRef;
                T t = ref$ObjectRef2.element;
                if (t == 0) {
                    ?? tuiVar = new tui(arrayList2, arrayList);
                    ref$ObjectRef2.element = tuiVar;
                    view.setTouchDelegate(tuiVar);
                } else {
                    tui tuiVar2 = (tui) t;
                    ArrayList arrayList3 = tuiVar2.d;
                    List<Rect> list = tuiVar2.b;
                    if (list.size() == arrayList.size()) {
                        int size4 = list.size();
                        for (int i4 = 0; i4 < size4; i4++) {
                            if (epx.f(list.get(i4), arrayList.get(i4))) {
                            }
                        }
                        size = list.size();
                        for (i = 0; i < size; i++) {
                            list.get(i).set((Rect) arrayList.get(i));
                        }
                        size2 = arrayList3.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            ((Rect) arrayList3.get(i5)).set(list.get(i5));
                            Rect rect2 = (Rect) arrayList3.get(i5);
                            int i6 = -tuiVar2.f;
                            rect2.inset(i6, i6);
                        }
                    }
                    tuiVar2.g = null;
                    size = list.size();
                    while (i < size) {
                    }
                    size2 = arrayList3.size();
                    while (i5 < size2) {
                    }
                }
                return s3q0.a;
            }
        });
    }

    @Override // xsna.pjw
    public String f(int i) {
        Image image;
        ImageSize Cb;
        Group group = (Group) this.c;
        if (i <= 0) {
            if (group != null) {
                return group.e;
            }
            return null;
        }
        if (group == null || (image = group.g) == null || (Cb = image.Cb(i, true, false)) == null) {
            return null;
        }
        return Cb.d.d;
    }

    @Override // xsna.g94
    public List getAll() {
        WriteBar writeBar = ((com.vk.channels.impl.channel_screen.send_msg.a) this.c).x;
        if (writeBar == null) {
            writeBar = null;
        }
        return writeBar.getAttachments();
    }

    public boolean h(LayoutNode layoutNode) {
        if (!layoutNode.e()) {
            uzw.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((SortedSet) this.c).remove(layoutNode);
    }

    public String toString() {
        switch (this.b) {
            case 7:
                return ((SortedSet) this.c).toString();
            default:
                return super.toString();
        }
    }

    public os9(int i) {
        this.b = i;
        switch (i) {
            case 7:
                this.c = new SortedSet(z0m.a);
                break;
            case 8:
                this.c = new LinkedHashMap();
                break;
            default:
                this.c = new ArrayList();
                break;
        }
    }

    public os9(VKAndroidAutoCatalogMediaService vKAndroidAutoCatalogMediaService) {
        Object ps9Var;
        this.b = 0;
        if (vKAndroidAutoCatalogMediaService.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            ps9Var = new so5();
        } else {
            ps9Var = new ps9(vKAndroidAutoCatalogMediaService);
        }
        this.c = ps9Var;
    }

    @Override // xsna.g94
    public void i(int i) {
    }

    @Override // xsna.g94
    public void j(LinkedHashMap linkedHashMap) {
    }

    @Override // xsna.g94
    public void g(PendingPhotoAttachment pendingPhotoAttachment, Integer num) {
    }
}
