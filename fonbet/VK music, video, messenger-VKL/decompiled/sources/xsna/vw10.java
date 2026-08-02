package xsna;

import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: MediaRouteDescriptor.java */
/* loaded from: classes12.dex */
public final class vw10 {
    public final Bundle a;

    public vw10(Bundle bundle) {
        this.a = bundle;
    }

    @NonNull
    public final HashSet a() {
        Bundle bundle = this.a;
        return !bundle.containsKey("allowedPackages") ? new HashSet() : new HashSet(bundle.getStringArrayList("allowedPackages"));
    }

    @NonNull
    public final ArrayList b() {
        Bundle bundle = this.a;
        return !bundle.containsKey("controlFilters") ? new ArrayList() : new ArrayList(bundle.getParcelableArrayList("controlFilters"));
    }

    @NonNull
    public final ArrayList c() {
        Bundle bundle = this.a;
        return !bundle.containsKey("groupMemberIds") ? new ArrayList() : new ArrayList(bundle.getStringArrayList("groupMemberIds"));
    }

    @NonNull
    public final String d() {
        return this.a.getString("id");
    }

    public final boolean e() {
        return (TextUtils.isEmpty(d()) || TextUtils.isEmpty(this.a.getString("name")) || b().contains(null)) ? false : true;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaRouteDescriptor{ id=");
        sb.append(d());
        sb.append(", groupMemberIds=");
        sb.append(c());
        sb.append(", name=");
        Bundle bundle = this.a;
        sb.append(bundle.getString("name"));
        sb.append(", description=");
        sb.append(bundle.getString("status"));
        sb.append(", iconUri=");
        String string = bundle.getString("iconUri");
        sb.append(string == null ? null : Uri.parse(string));
        sb.append(", isEnabled=");
        sb.append(bundle.getBoolean("enabled", true));
        sb.append(", isSystemRoute=");
        sb.append(bundle.getBoolean("isSystemRoute", false));
        sb.append(", connectionState=");
        sb.append(bundle.getInt("connectionState", 0));
        sb.append(", controlFilters=");
        sb.append(Arrays.toString(b().toArray()));
        sb.append(", playbackType=");
        sb.append(bundle.getInt("playbackType", 1));
        sb.append(", playbackStream=");
        sb.append(bundle.getInt("playbackStream", -1));
        sb.append(", deviceType=");
        sb.append(bundle.getInt("deviceType"));
        sb.append(", volume=");
        sb.append(bundle.getInt("volume"));
        sb.append(", volumeMax=");
        sb.append(bundle.getInt("volumeMax"));
        sb.append(", volumeHandling=");
        sb.append(bundle.getInt("volumeHandling", 0));
        sb.append(", presentationDisplayId=");
        sb.append(bundle.getInt("presentationDisplayId", -1));
        sb.append(", extras=");
        sb.append(bundle.getBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS));
        sb.append(", isValid=");
        sb.append(e());
        sb.append(", minClientVersion=");
        sb.append(bundle.getInt("minClientVersion", 1));
        sb.append(", maxClientVersion=");
        sb.append(bundle.getInt("maxClientVersion", Integer.MAX_VALUE));
        sb.append(", isVisibilityPublic=");
        sb.append(bundle.getBoolean("isVisibilityPublic", true));
        sb.append(", allowedPackages=");
        sb.append(Arrays.toString(a().toArray()));
        sb.append(" }");
        return sb.toString();
    }

    /* compiled from: MediaRouteDescriptor.java */
    public static final class a {
        public final Bundle a;
        public final ArrayList b;
        public final ArrayList c;
        public final HashSet d;

        public a(@NonNull String str, @NonNull String str2) {
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = new HashSet();
            Bundle bundle = new Bundle();
            this.a = bundle;
            if (str == null) {
                throw new NullPointerException("id must not be null");
            }
            bundle.putString("id", str);
            if (str2 == null) {
                throw new NullPointerException("name must not be null");
            }
            bundle.putString("name", str2);
        }

        @NonNull
        public final void a(@NonNull ArrayList arrayList) {
            if (arrayList == null) {
                throw new IllegalArgumentException("filters must not be null");
            }
            if (arrayList.isEmpty()) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                IntentFilter intentFilter = (IntentFilter) it.next();
                if (intentFilter != null) {
                    ArrayList arrayList2 = this.c;
                    if (!arrayList2.contains(intentFilter)) {
                        arrayList2.add(intentFilter);
                    }
                }
            }
        }

        @NonNull
        public final vw10 b() {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.c);
            Bundle bundle = this.a;
            bundle.putParcelableArrayList("controlFilters", arrayList);
            bundle.putStringArrayList("groupMemberIds", new ArrayList<>(this.b));
            bundle.putStringArrayList("allowedPackages", new ArrayList<>(this.d));
            return new vw10(bundle);
        }

        public a(@NonNull vw10 vw10Var) {
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = new HashSet();
            if (vw10Var != null) {
                this.a = new Bundle(vw10Var.a);
                this.b = vw10Var.c();
                this.c = vw10Var.b();
                this.d = vw10Var.a();
                return;
            }
            throw new IllegalArgumentException("descriptor must not be null");
        }
    }
}
