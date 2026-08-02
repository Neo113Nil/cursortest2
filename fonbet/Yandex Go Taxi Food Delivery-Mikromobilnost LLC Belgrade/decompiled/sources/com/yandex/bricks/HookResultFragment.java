package com.yandex.bricks;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import defpackage.ny61;
import java.util.Objects;

/* loaded from: classes11.dex */
public class HookResultFragment extends Fragment {
    static final String FRAGMENT_TAG = "bricks_hook_fragment";
    private static final String REQUESTS = "requests";
    private SparseArray<Request> mOngoingRequests;

    private int registerRequest(String str, int i) {
        FragmentManager fragmentManager = getFragmentManager();
        Objects.requireNonNull(fragmentManager);
        int i2 = 0;
        if (fragmentManager.S()) {
            ny61.k();
            return 0;
        }
        SparseArray<Request> sparseArray = this.mOngoingRequests;
        if (sparseArray != null && sparseArray.size() > 0) {
            i2 = this.mOngoingRequests.keyAt(r0.size() - 1) + 1;
        }
        if (this.mOngoingRequests == null) {
            this.mOngoingRequests = new SparseArray<>();
        }
        this.mOngoingRequests.put(i2, new Request(str, i));
        return i2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Request request;
        super.onActivityResult(i, i2, intent);
        SparseArray<Request> sparseArray = this.mOngoingRequests;
        if (sparseArray == null || (request = sparseArray.get(i)) == null) {
            return;
        }
        this.mOngoingRequests.remove(i);
        e.c(requireActivity()).dispatchOnActivityResult(request.brickId, request.originalRequestCode, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.mOngoingRequests = bundle.getSparseParcelableArray(REQUESTS);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Request request;
        super.onRequestPermissionsResult(i, strArr, iArr);
        SparseArray<Request> sparseArray = this.mOngoingRequests;
        if (sparseArray == null || (request = sparseArray.get(i)) == null) {
            return;
        }
        this.mOngoingRequests.remove(i);
        e.c(requireActivity()).dispatchOnRequestPermissionsResult(request.brickId, request.originalRequestCode, strArr, iArr);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        SparseArray<Request> sparseArray = this.mOngoingRequests;
        if (sparseArray == null || sparseArray.size() <= 0) {
            return;
        }
        bundle.putSparseParcelableArray(REQUESTS, this.mOngoingRequests);
    }

    public void requestPermissions(String str, String[] strArr, int i) {
        requestPermissions(strArr, registerRequest(str, i));
    }

    public void startActivityForResult(String str, Intent intent, int i) {
        startActivityForResult(intent, registerRequest(str, i));
    }

    public static class Request implements Parcelable {
        public static final Parcelable.Creator<Request> CREATOR = new Parcelable.Creator<Request>() { // from class: com.yandex.bricks.HookResultFragment.Request.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Request createFromParcel(Parcel parcel) {
                return new Request(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Request[] newArray(int i) {
                return new Request[i];
            }
        };
        final String brickId;
        final int originalRequestCode;

        public Request(Parcel parcel) {
            String readString = parcel.readString();
            Objects.requireNonNull(readString);
            this.brickId = readString;
            this.originalRequestCode = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.brickId);
            parcel.writeInt(this.originalRequestCode);
        }

        public Request(String str, int i) {
            this.brickId = str;
            this.originalRequestCode = i;
        }
    }
}
